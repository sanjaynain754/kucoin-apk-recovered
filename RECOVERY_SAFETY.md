# Recovery Safety Baseline

- Original APK: `/home/ubuntu/upload/kucoin.apk`
- SHA-256: `15764b41c57296606f3828b3a0071cfef16ac3f4e591f758437a18522409e5f6`
- Original APK is treated as read-only input.
- `smali/`, `smali_classes*/`, and `jadx_sources/` are preserved as recovery references.
- No APK was installed, launched, signed, or connected to an exchange account.
- No credentials, tokens, cookies, API keys, or server-side account data were intentionally accessed.
- All repair work must be written to separate retry/manual directories first.
- Decompiled code is not run during static repair.

## Data-loss assessment

Static decompilation only reads the APK bytes and writes local files. It cannot delete exchange account data, balances, trades, or server records. Risk begins only if a rebuilt APK is installed/launched and allowed to authenticate or call production APIs; that is explicitly out of scope for this recovery pass.
