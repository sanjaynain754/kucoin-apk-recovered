# APK Code Recovery Package

यह repository `kucoin.apk` से recovered project का complete working snapshot है। Database recovery इस चरण में शामिल नहीं है।

## कहाँ क्या मिलेगा

| Path | Contents |
|---|---|
| `AndroidManifest.xml` | Decoded manifest और components |
| `res/` | Decoded Android resources और plain-text XML |
| `smali/`, `smali_classes2/` … `smali_classes64/` | Original DEX bytecode का सबसे authoritative recovered form |
| `assets/`, `lib/`, `kotlin/`, `unknown/` | APK assets, native libraries और remaining decoded files |
| `jadx_sources/` | JADX 1.5.6 से निकली 50,508 Java files |
| `jadx_fallback_sources/` | 179 files जिनमें structured JADX output कठिन था; fallback control-flow output |
| `jadx_manual/com/kubi/user/token/` | Token lifecycle की targeted recovery |
| `jadx_manual/com/kubi/kucoin/R.java` | Resource `R.java` की deterministic repair; 22 generated constructor errors हटाए गए |
| `RECOVERED_CORE_LOGIC_ANALYSIS_HI.md` | Hindi architecture/business-logic analysis |
| `JADX_ERROR_INVENTORY.md` | Original structured JADX error inventory |
| `JADX_FALLBACK_RECOVERY.md` | Full APK fallback recovery details |
| `RECOVERY_SAFETY.md` | Safety rules और original APK checksum |

## Recovery status

- APK input unchanged और checksum preserved है।
- APK install, launch या production API connection नहीं किया गया।
- Decompiled project tree और resources recovered हैं।
- 50,508 Java source approximations उपलब्ध हैं।
- Failed structured methods के लिए fallback output उपलब्ध है।
- Remaining database/account recovery इस package का हिस्सा नहीं है।

## Important interpretation

यह original Gradle project नहीं है। APK compilation, obfuscation, Kotlin coroutine transformation और native/Flutter/React Native packaging के कारण original comments, build files, exact names और कुछ high-level source structure recover नहीं हो सकते। ऐसे मामलों में `smali*` files executable bytecode का authoritative reference हैं।
