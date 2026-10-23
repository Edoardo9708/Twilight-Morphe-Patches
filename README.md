# Twilight Morphe Patches

Patch sperimentali per **Twilight** (`com.urbandroid.lux`) usando Morphe.

**Versione analizzata:** 14.32 (617), formato APKM.

[Aggiungi la sorgente a Morphe](https://morphe.software/add-source?github=Edoardo9708/Twilight-Morphe-Patches)

## Patch disponibili

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.1](https://github.com/Edoardo9708/Twilight-Morphe-Patches/releases/tag/v1.0.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;2 patches total
<details open>
<summary>📦 XYZ app&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 2.0.0 | 1.0.2 |
| :---: | :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Example Patch](#example-patch) | Example patch to start with. |  |

</details>

<details open>
<summary>📦 Twilight&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 14.32 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Test stato trial](#test-stato-trial) | Fa restituire false a isTrial() per studiare i controlli dell'interfaccia (sperimentale). |  |

</details>

<!-- PATCHES_END -->

## Note

La patch *Test stato trial* è un esperimento limitato a `TrialFilter.isTrial()`. Non modifica `reevaluate()`, la verifica delle firme o la logica interna di `License`. Non è stato ancora verificato quali funzionalità risultino effettivamente disponibili.

## Compilazione

`./gradlew buildAndroid`

Le release vengono generate automaticamente dal workflow già incluso nel template.
