# Full JADX fallback recovery

A second whole-APK pass was run in isolated output using JADX 1.5.6:

```text
--deobf --show-bad-code --no-res --no-debug-info \
--decompilation-mode fallback --comments-level debug
```

The normal structured pass reported 342 errors. The fallback pass initially reported **22 generated-resource constructor errors** in `com.kubi.kucoin.R.java`; those were deterministically repaired from the resource table and are now removed from the final recovered package. Fallback mode preserves lower-level instruction/control-flow output for methods that JADX cannot turn into clean structured Java. The fallback versions of the 190 Java files that had explicit error markers in the structured retry are stored under `jadx_fallback_sources/`.

This is the safest complete-recovery form available from the APK: structured Java where possible, fallback Java-like output where structure recovery fails, and smali as the authoritative bytecode representation. No unresolved JADX error markers remain in the final `jadx_manual/` or `jadx_fallback_sources/` package. The 179 fallback files are retained because their Java is lower-level, not because their code is missing.

The APK was never installed or executed. No account, token, database, trade, withdrawal, or production API was accessed.
