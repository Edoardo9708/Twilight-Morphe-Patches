package app.edoardo9708.twilight.patches

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.bytecodePatch

// Limitiamo il test alla versione dell'APK effettivamente analizzata.
private val TWILIGHT = Compatibility(
    name = "Twilight",
    packageName = "com.urbandroid.lux",
    apkFileType = ApkFileType.APKM,
    appIconColor = 0xFF6F43,
    targets = listOf(AppTarget(version = "14.32"))
)

// Identifica esclusivamente il getter booleano di TrialFilter.
private object TrialStatusFingerprint : Fingerprint(
    definingClass = "Lcom/urbandroid/lux/util/TrialFilter;",
    name = "isTrial",
    returnType = "Z",
    parameters = emptyList()
)

@Suppress("unused")
val trialStatusExperimentPatch = bytecodePatch(
    name = "Test stato trial",
    description = "Fa restituire false a isTrial() per studiare i controlli dell'interfaccia (sperimentale).",
    default = false
) {
    compatibleWith(TWILIGHT)

    execute {
        TrialStatusFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """.trimIndent()
        )
    }
}
