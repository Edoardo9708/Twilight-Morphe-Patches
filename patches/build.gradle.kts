group = "app.edoardo9708.twilight"

patches {
    about {
        name = "Twilight Morphe Patches"
        description = "Patch sperimentali per Twilight"
        source = "https://github.com/Edoardo9708/Twilight-Morphe-Patches"
        author = "Edoardo9708"
        contact = "https://github.com/Edoardo9708"
        website = "https://github.com/Edoardo9708/Twilight-Morphe-Patches"
        license = "GPLv3"
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath = configurations.create("patchListGeneratorClasspath")

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
