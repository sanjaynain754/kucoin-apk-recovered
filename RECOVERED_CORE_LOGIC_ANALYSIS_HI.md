# Recovered APK: Core Business Logic Analysis

**Analysis type:** Static analysis of apktool-generated smali/resources  
**Input:** `kucoin.apk` recovery snapshot  
**Package:** `com.kubi.kucoin`  
**Decompiler:** apktool 2.7.0  
**Analysis date:** 2026-10-10

## 1. Executive summary

यह APK एक बड़े, production-grade crypto-exchange client का decompiled snapshot है। इसका core business model निम्न है:

1. user को authenticate करके session/token बनाए रखना;
2. market data को HTTP तथा WebSocket/stream channels से लाना;
3. spot, margin और futures trading screens पर order/position workflows चलाना;
4. wallet/assets, deposit/withdraw तथा internal transfer को संभालना;
5. fiat/P2P/third-party payment flows देना;
6. KYC/compliance, region restrictions और risk/leverage rules लागू करना;
7. remote configuration, maintenance और feature flags से behavior बदलना;
8. कुछ high-complexity surfaces को Flutter और React Native bundles में चलाना।

यह original Java/Kotlin source नहीं है। Kotlin compiler, obfuscation और R8 के कारण बहुत से method/class names बदल चुके हैं; इसलिए नीचे के निष्कर्ष **high-confidence architectural findings** हैं, जबकि exact formulas, endpoint payloads और छोटे validation rules के लिए original source/build metadata चाहिए।

## 2. Application entry और startup flow

Manifest से मुख्य flow:

- launcher: `com.kubi.kucoin.feature.SplashActivity`
- main shell: `com.kubi.kucoin.main.KuCoinMainActivity`
- application wrapper: `com.secneo.apkwrapper.AW`
- package: `com.kubi.kucoin`

### Startup sequence

`SplashActivity` में निम्न संकेत मिले:

- launch intent/category और deep-link intent की जाँच;
- `LauncherManager` के माध्यम से startup tasks;
- splash timing/telemetry markers (`splash_start_oncreate`, duration markers);
- launcher intent पूरा होने पर main application shell की ओर navigation;
- deep links के लिए `kucoin://`, `kucoin.onelink.me` और `link.kucoin.com` intent filters।

`KuCoinMainActivity` कई facade services resolve करती है:

- `IQuoteFacadeService` — quotes/market surfaces;
- `ITradeFacadeService` — trade tab और trading navigation;
- `IAssetsCenterService` — assets center;
- `IHomeService` तथा `IHomeRNService` — native/RN home surfaces;
- `IKuMexService` — futures/Kumex area;
- `INoticeService`, OTC और maintenance-related services।

इससे पता चलता है कि main activity business logic स्वयं कम करती है; यह navigation, tab switching, service orchestration, maintenance/restriction overlays और child fragments/modules का coordinator है।

## 3. High-level module map

| Module/package संकेत | Business responsibility |
|---|---|
| `com.kubi.user` | Login/signup, passkey, external account binding, token lifecycle, user/site state |
| `com.kubi.home` / `home.main` / `homern` | Home/dashboard, banners, widgets और RN home |
| `com.kubi.quotefacade` | Market quotes, favorites, market lists, holdings, K-line entry points |
| `com.kubi.spot` | Spot market/trade UI, symbol selection, order entry, delegation/order history |
| `com.kubi.margin` | Cross/isolated margin, borrowing, risk views, leverage और margin positions |
| `com.kubi.futures` / `com.kubi.kumex` | Futures contracts, order book, positions, leverage, funding/risk और history |
| `com.kubi.assets` | Account balances, unified/spot/futures assets, bills, PnL, deposit/withdraw |
| `com.kubi.unify` | Unified account, equity/available balance, positions, risk rate, loan/leverage config |
| `com.kubi.transfer` | Internal transfer coin/symbol search और transfer flows |
| `com.kubi.payment` / `com.kubi.otc` | Fiat buy/sell, P2P, payment methods, cards, third-party payment confirmation |
| `com.kubi.wallet` / `com.kubi.flutter` | Flutter-based Web3/wallet surface और native bridge |
| `com.kubi.rn` / `homern` | React Native bundles, route/event bridge और split bundle loading |
| `com.kubi.kyc` / `safe` / `permission` | KYC, identity document/liveness flows, security settings और permissions |
| `com.kubi.tradingbotkit` | Trading bots, grid strategies, coupons और bot-related widgets |
| `com.kubi.copytrading` | Futures copy-trading surface और guide/data flows |
| `com.kubi.config` / `kcrc` | Remote config cache/fetch, incremental updates, feature flags |
| `com.kubi.network` | Retrofit/OkHttp, WebSocket, protobuf subscription और request handling |

## 4. Authentication और session/token lifecycle

`com.kubi.user.token.TokenLifecycleRefreshExecutor` और संबंधित classes सबसे महत्वपूर्ण session components में हैं। Static evidence के अनुसार:

- access/session token refresh के लिए coroutine-based asynchronous flow है;
- refresh प्रति session/account track किया जाता है;
- network failure पर retry path है;
- कुछ error codes (`280001`, `280010`, `280003`) को special handling set में रखा गया है;
- session invalid/removed होने पर lifecycle-safe activity पर kick-out/login-out dialog दिखाया जाता है;
- user को login/signup flow पर भेजने का path है;
- `TokenLifecycleRefreshRequestInterceptor` refresh request के दौरान `X-KC-TOKEN-LIFECYCLE-ATTRIBUTION` को हटाता और refresh response के बाद local account attribution को `X-APP-TOKEN` request header में restore करता है।

### Login surface

Manifest में `LoginV2Activity`, `SignupActivity`, external account binding और `PasskeyLoginActivity` हैं। इसका अर्थ है कि authentication केवल password screen तक सीमित नहीं है; इसमें passkey और third-party account paths भी हैं।

### Important limitation

Smali में token values को execute या decode नहीं किया गया और कोई credential export नहीं किया गया। Static scan में hard-coded user secret का निष्कर्ष नहीं निकाला जा सकता; runtime configuration और server-issued values अलग हो सकते हैं।

## 5. Market-data architecture

Network package names और classes निम्न design दिखाते हैं:

- REST-style service interfaces और RxJava `Observable`/Kotlin `Flow`;
- `DefaultWebSocketClient`, socket bus/core/socketio classes;
- protobuf subscription adapter (`ProtobufSubscribeConvertAdapter` संकेत);
- spot तथा futures के लिए अलग market stream implementations;
- ticker, order-book और price observers;
- cached/remote configuration और app foreground पर refresh।

Futures side पर `ContractTradePbMarketSocket` में ticker और book observers दिखते हैं। Unified stream classes में positions, margin mode, account overview, funds info, index prices और leverage observe करने वाले flows हैं। इसलिए live trading UI का data model polling-only नहीं है; streaming + REST reconciliation model अधिक संभावित है।

## 6. Spot trading logic

`ISpotService` और `ISpotCommonService` public method signatures से निम्न responsibilities स्पष्ट हैं:

- current symbol/market item select करना;
- symbol click और market-ready navigation;
- spot trade tab पर jump करना;
- favorite symbol add करना;
- symbol state और trading eligibility checks;
- trade fragment creation/navigation;
- price/amount से जुड़ी formatting तथा symbol metadata;
- event/observable callbacks और lifecycle binding;
- order/delegation screens और order history के लिए अलग business packages।

`com.kubi.spot.business.submit`, `delegation`, `quote` और `kline` packages यह संकेत देते हैं कि screen layer से अलग submit/order state layer है। Decompiled names में कुछ implementation methods obfuscated हैं, इसलिए exact order request field mapping को interface contract से पूरी तरह पुनर्निर्मित नहीं किया जा सकता।

## 7. Margin trading logic

`IMarginService` में high-confidence signals:

- cross और isolated margin दोनों;
- `MarginPosition`, `FundsInfo`, `LeverBalance`, bridge config और fee entity;
- single margin position lookup;
- cross-assets list और isolated position list;
- borrow/repay/transfer-like operations के लिए asynchronous service calls;
- margin risk view और risk-related calculations;
- symbol-specific precision/fee/available balance helpers;
- margin trade tab navigation और error/retry UI।

Margin module में `margin/trade`, `margin/market`, `margin/kline`, `margin/market/trade` और position/dialog packages हैं। इसका practical flow है: symbol/config load → available funds/risk data → amount/price validation → borrow/repay/leveraged order UI → server response के बाद balances/positions refresh।

## 8. Futures/Kumex logic

Futures package inventory में निम्न business areas स्पष्ट हैं:

- `FuturesTradeViewModel` और `FuturesTradeFragment`;
- contract market service और protobuf market socket;
- positions, order book, history और current delegation;
- leverage settings, position mode, risk limit और auto-margin/deposit;
- reverse position तथा close-all-position dialogs;
- funding-rate/price-spread और contract status observers;
- Europe compliance तथा leverage unlock/trial flows;
- copy-trading, welfare/bonus और trading competition surfaces।

`CrossLeverageSettingViewModel`, `IsolatedLeverageSettingViewModel`, `ModifyPositionModeViewModel`, `IsolatedRiskLimitViewModel` और `TradingPreferenceViewModel` से पता चलता है कि leverage/position-mode changes स्वतंत्र validation/submission workflows हैं। ये केवल UI toggles नहीं हैं; server-backed settings और risk-limit state से जुड़े हैं।

Likely order lifecycle:

1. contract/symbol configuration और market stream load;
2. user mode/leverage/risk limit पढ़ना;
3. local input/precision validation;
4. order या position action submit करना;
5. response/error को state flow में publish करना;
6. live position/order-book stream से UI reconcile करना।

## 9. Unified account और assets

`IUnifyAccountService` और `UnifyGlobalDataManager` में निम्न state flows/data दिखाई देते हैं:

- available balance/equity के लिए `BigDecimal` flows;
- per-symbol balances और map-of-currency data;
- hourly rates;
- loan currency तथा user loan leverage config;
- account risk rate;
- positions और order mapping (`PositionMapper`, `OrderMapper`, `HistoryMapper`);
- unified account toggle/education/exam-like flows;
- repay/loan related navigation और account UI।

`AssetUnifiedViewModel` में overview, PnL overview, products, margin currency settings और unified asset list fetch methods हैं। `AssetOverviewViewModel`, `AssetCoinViewModel` और `AssetOnGoingViewModel` balances, recent transactions और stream/poll refresh orchestration संभालते हैं।

इससे architecture का मुख्य pattern निकलता है: **server truth + local reactive state + periodic/live updates**।

## 10. Deposit, withdraw और transfer

Asset/search/deposit-and-withdraw तथा payment packages के साथ निम्न flows मौजूद हैं:

- coin/network चयन;
- address/account selection;
- withdraw confirmation और pre-verification;
- QR/barcode scanning;
- bank/fiat payment methods;
- internal transfer में coin/symbol search history और filtered display list।

`ITransferService` एक symbol-search state flow expose करता है। इससे internal transfer को अलग reusable feature के रूप में implement किया गया है, न कि केवल assets screen का hard-coded dialog।

## 11. Fiat, P2P और payment logic

Manifest में `PayFiatActivity`, `FiatOrderActivity`, `PaymentWebActivity`, `FastTradeActivity`, `P2PActivity`, order-detail तथा QR scan activities मौजूद हैं। Payment package में:

- fast buy/sell;
- P2P trade/order history/order detail;
- payment-method categories;
- bank-card/third-party/Google Pay/Revolut/Ivy integrations;
- fee confirmation और recurring payment;
- fiat/currency selectors;
- third-party verification और status screens।

यह हिस्सा exchange backend के साथ stateful order/payment confirmation workflow बनाता है। Third-party apps के लिए manifest deep links भी हैं, इसलिए callback/deferred confirmation paths मौजूद हैं।

## 12. Flutter और React Native integration

### Flutter

`WalletFlutterActivity`:

- `FlutterViewDelegate` का उपयोग करती है;
- `flutterInitialRoute`, `jumpUrl`, `wallet_animation` और `from` जैसे intent extras पढ़ती है;
- `entry=web3Wallet` route/event भेजती है;
- native event bus `com.kubi.event.FlutterEvent:flutterCommonEvent` से bridge करती है;
- Flutter display होने तक mask/loading animation रखती है;
- permissions, activity results और back press Flutter delegate को forward करती है;
- wallet/Web3 surface को native trading shell से अलग रखती है।

APK में `assets/flutter_assets`, `libflutter.so`, `libapp.so` और wallet-related native libraries हैं। इसलिए wallet का महत्वपूर्ण हिस्सा smali में नहीं बल्कि Flutter AOT/native bundle में है; केवल Android bridge यहाँ दिखाई देती है।

### React Native

`com.kubi.rn` classes में `BundleLoader`, `SplitBundleLoader`, `ReactRootViewHost`, `RNInstanceManagerHolder`, `RNEventDispatcher` और turbo/common modules हैं। इससे home तथा कुछ hybrid screens split JS bundle load करके native services/events से जुड़ती हैं। RN JavaScript logic `assets/jsbundles` में हो सकती है, पर APK से original readable TypeScript/JavaScript source वापस नहीं मिलता।

## 13. KYC, compliance और risk controls

Manifest permissions तथा classes से:

- camera, microphone, location और storage capabilities;
- Sumsub/Jumio-जैसे identity verification components;
- document picker, selfie/liveness, eID/MRTD और video-identification screens;
- country/site restriction state;
- Europe compliance और futures leverage trial/unlock flows;
- account restricted state और maintenance overlay।

`UserRestrictedStateBean`, maintenance entity handling और compliance-specific ViewModels दिखाते हैं कि availability region, KYC state और server policy पर निर्भर है।

## 14. Remote configuration और feature rollout

`RemoteConfig`, `KCRemoteConfigFetcher`, `KCRemoteConfigCache`, `KCRemoteConfigWS` और config-related startup/foreground listeners मिले। व्यवहार का likely flow:

1. cached config से startup behavior चलाना;
2. foreground/incremental fetch या WebSocket update करना;
3. remote key के आधार पर feature/route/screen बदलना;
4. invalid config पर monitor/log path लेना;
5. maintenance, crash-switch और rollout controls लागू करना।

`kc_rn_screen_crash_switch` जैसा flag और `maintenance` path मिले हैं। इसलिए किसी missing screen या alternate flow को केवल code deletion न मानें—वह remote flag से disabled हो सकता है।

## 15. Security/operational observations

Manifest में `usesCleartextTraffic="false"` और `network_security_config` मौजूद है, जो सामान्यतः plaintext HTTP को रोकने का संकेत है। साथ ही:

- token lifecycle interceptor मौजूद है;
- biometric/passkey permissions हैं;
- anti-tamper/loader wrapper (`com.secneo.apkwrapper.AW`) है;
- Xposed/Substrate packages को query किया गया है, जो anti-hook/compatibility checks का संकेत हो सकता है;
- overlay, camera, microphone, notification और boot permissions feature-specific हैं।

ये observations **security audit के बराबर नहीं** हैं। Runtime instrumentation, server behavior और obfuscated native code का अलग परीक्षण चाहिए।

## 16. What cannot be recovered reliably from this APK

- original Kotlin/Java source formatting, comments और meaningful local variable names;
- Gradle modules, dependency versions और build scripts;
- complete API schema/payload contracts;
- server-side order matching, risk engine और fee formulas;
- Flutter Dart source और React Native original TypeScript/JS source;
- native `.so` libraries का full business logic;
- runtime-only remote configuration values;
- server keys, signing credentials या user account data।

## 17. Recommended next analysis passes

यदि original project को फिर से reconstruct करना है, तो priority यह होनी चाहिए:

1. `com.kubi.user.token` और login/signup flows;
2. `com.kubi/network` request/response/interceptor layer;
3. spot order submit तथा order-history state;
4. futures `FuturesTradeViewModel` और position/order services;
5. `AssetUnifiedViewModel` तथा unified account streams;
6. router/deep-link mapping;
7. `assets/jsbundles` और Flutter asset inventory;
8. native libraries के exported symbols/strings का अलग audit।

### निष्कर्ष

Recovered APK से core product behavior काफी स्पष्ट है: यह multi-module exchange client है जिसमें authentication/session management, live market data, spot/margin/futures trading, unified assets, fiat/P2P payments, KYC/compliance, Web3 wallet और remote-config driven rollout एक ही shell में orchestrated हैं। Exact source-level पुनर्निर्माण के लिए smali को deobfuscate/rename करके feature-by-feature call graph बनाना अगला चरण होगा।
