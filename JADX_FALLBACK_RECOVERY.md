# Full JADX fallback recovery

A second whole-APK pass was run in isolated output using JADX 1.5.6:

```text
--deobf --show-bad-code --no-res --no-debug-info \
--decompilation-mode fallback --comments-level debug
```

The normal structured pass reported 342 errors. The fallback pass reported **22** errors. Fallback mode preserves lower-level instruction/control-flow output for methods that JADX cannot turn into clean structured Java. The fallback versions of the 190 Java files that had explicit error markers in the structured retry are stored under `jadx_fallback_sources/`.

This is the safest complete-recovery form available from the APK: structured Java where possible, fallback Java-like output where structure recovery fails, and smali as the authoritative bytecode representation. The 22 remaining fallback errors need per-method CFG/smali reconstruction and cannot be honestly replaced with invented source.

The APK was never installed or executed. No account, token, database, trade, withdrawal, or production API was accessed.
