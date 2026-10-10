# JADX Error Inventory and Repair Queue

Generated from the isolated retry using JADX 1.5.6 with `--deobf --show-bad-code --no-res --no-debug-info`. The retry reported **342 errors**. This inventory is diagnostic; it does not modify the original APK, smali, or the main JADX output.

## Safety

The original APK remains unchanged and is referenced by SHA-256 `15764b41c57296606f3828b3a0071cfef16ac3f4e591f758437a18522409e5f6`. Repair output is isolated under `jadx_manual/` and `jadx_target_token/`.

## Counts

- Java files containing explicit JADX error markers: **190**
- App-owned (`com/kubi`) files with markers: **64**
- JADX process error count: **342**

## Error categories

| Count | Category |
|---:|---|
| 84 | `JadxOverflowException in pass: RegionMakerVisitor` |
| 60 | `JadxRuntimeException in pass: ModVisitor` |
| 11 | `Types fix failed` |
| 11 | `Type inference failed` |
| 9 | `Method code generation error` |
| 5 | `JadxRuntimeException in pass: RegionMakerVisitor` |
| 3 | `Method generation error` |
| 3 | `JadxRuntimeException in pass: IfRegionVisitor` |
| 2 | `UnsupportedOperationException in pass: RegionMakerVisitor` |
| 1 | `JadxRuntimeException in pass: InitCodeVariables` |
| 1 | `JadxRuntimeException in pass: FinishTypeInference` |
| 1 | `StackOverflowError in pass: RegionMakerVisitor` |
| 1 | `JadxRuntimeException in pass: BlockProcessor` |
| 1 | `UnsupportedOperationException in pass: SwitchBreakVisitor` |
| 1 | `JadxRuntimeException in pass: ConstructorVisitor` |

## First repair target

`com/kubi/user/token/TokenLifecycleRefreshExecutor` was retried as a single class in `restructure`, `simple`, and `fallback` modes. `restructure` and `simple` each retained two errors in `refreshTokenInternal` (`B`), caused by type inference/code generation overflow. `fallback` completed without an error summary and preserved the full lower-level control flow. The fallback result is copied to `jadx_manual/com/kubi/user/token/TokenLifecycleRefreshExecutor.java`; the corresponding smali remains authoritative.

## Priority app-owned classes

| File | Error category |
|---|---|
| `com/kubi/futures/trade/order/modify/limit/LimitModifyOrderViewModel.java` | Method code generation error |
| `com/kubi/futures/dialog/vm/ReversePositionViewModel.java` | Method code generation error |
| `com/kubi/kumex/record/DelegationOrderDetailFragment.java` | Types fix failed |
| `com/kubi/spot/business/mvi/SpotTradeViewModel$subscribeBannerData$1.java` | Method code generation error |
| `com/kubi/user/token/TokenLifecycleRefreshExecutor.java` | Type inference failed |
| `com/kubi/payment/p2p/order/OrderDetailViewModel.java` | JadxOverflowException in pass: RegionMakerVisitor |
| `com/kubi/payment/p2p/order/OrderDetailViewModel$startAutoCancelOrderTime$1.java` | JadxOverflowException in pass: RegionMakerVisitor |
| `com/kubi/payment/p2p/order/OrderDetailViewModel$startPayCoinLeftTime$1.java` | JadxOverflowException in pass: RegionMakerVisitor |

## Repair policy

1. Keep original `smali*` and `jadx_sources` untouched.
2. Retry one app-owned class at a time with targeted JADX options.
3. If restructure mode fails, retain fallback output plus a smali-derived explanation rather than inventing a compile-ready implementation.
4. Do not install, launch, sign, or connect any rebuilt APK to production services.
