package com.kubi.assets.view.tab;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.C9459a;
import com.kubi.assets.R$string;
import com.kubi.assets.alpha.AlphaFragment;
import com.kubi.assets.bot.BotAssetContainerFragment;
import com.kubi.assets.cloudming.CloudMiningFragment;
import com.kubi.assets.entity.TabItem;
import com.kubi.assets.finance.FinanceFragment;
import com.kubi.assets.futures.coins.AssetFuturesCoinsFragment;
import com.kubi.assets.main.AssetV2MainFragment;
import com.kubi.assets.margin.AssetV2MarginFragment;
import com.kubi.assets.options.main.OptionsAssetMainFragment;
import com.kubi.assets.overview.AssetOverviewFragment;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.spot.AssetV2SpotFragment;
import com.kubi.assets.unify.AssetUnifiedFragment;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.data.coin.AccountType;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.s0 */
/* JADX INFO: compiled from: TabOrderExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u001a\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u001a\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u001a\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\t"}, m90084d2 = {"sortAssetsTabs", "", "Lcom/kubi/assets/entity/TabItem;", "sourceTabs", "getUnifiedModelAssetsTabs", "", "getClassicModelAssetsTabs", "getDefaultModelAssetsTabs", "buildTabItems", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabOrderExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabOrderExt.kt\ncom/kubi/assets/view/tab/TabOrderExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,209:1\n1193#2,2:210\n1267#2,4:212\n1056#2:216\n135#3,2:217\n*S KotlinDebug\n*F\n+ 1 TabOrderExt.kt\ncom/kubi/assets/view/tab/TabOrderExtKt\n*L\n73#1:210,2\n73#1:212,4\n74#1:216\n168#1:217,2\n*E\n"})
public final class C11325s0 {

    /* JADX INFO: renamed from: com.kubi.assets.view.tab.s0$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TabOrderExt.kt\ncom/kubi/assets/view/tab/TabOrderExtKt\n*L\n1#1,328:1\n74#2:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f19181b;

        public a(Map map) {
            this.f19181b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Integer num = (Integer) this.f19181b.get(((TabItem) t11).getKey());
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) this.f19181b.get(((TabItem) t12).getKey());
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m20113M() {
        return true;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m20122V() {
        return true;
    }

    /* JADX INFO: renamed from: t0 */
    public static final boolean m20166t0() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final List<TabItem> m20111K() {
        return CollectionsKt.listOf((Object[]) new TabItem[]{new TabItem("overview", new Function0() { // from class: com.kubi.assets.view.tab.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20122V());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20140g0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20158p0();
            }
        }), new TabItem("unified", new Function0() { // from class: com.kubi.assets.view.tab.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20160q0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20162r0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20164s0();
            }
        }), new TabItem("main", new Function0() { // from class: com.kubi.assets.view.tab.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20166t0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20168u0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20112L();
            }
        }), new TabItem("trade", new Function0() { // from class: com.kubi.assets.view.tab.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20113M());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20114N();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20115O();
            }
        }), new TabItem(ViewProps.MARGIN, new Function0() { // from class: com.kubi.assets.view.tab.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20116P());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20117Q();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20118R();
            }
        }), new TabItem(SearchCategory$Companion.FUTURES, new Function0() { // from class: com.kubi.assets.view.tab.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20119S());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20120T();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20121U();
            }
        }), new TabItem("alpha", new Function0() { // from class: com.kubi.assets.view.tab.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20123W());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20124X();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20125Y();
            }
        }), new TabItem("bots", new Function0() { // from class: com.kubi.assets.view.tab.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20126Z());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20128a0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20130b0();
            }
        }), new TabItem("finance", new Function0() { // from class: com.kubi.assets.view.tab.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20132c0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20134d0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20136e0();
            }
        }), new TabItem(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, new Function0() { // from class: com.kubi.assets.view.tab.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20138f0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20142h0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20144i0();
            }
        }), new TabItem("mining", new Function0() { // from class: com.kubi.assets.view.tab.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20146j0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20148k0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20150l0();
            }
        }), new TabItem("copyTrading", new Function0() { // from class: com.kubi.assets.view.tab.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C11325s0.m20152m0());
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20154n0();
            }
        }, new Function0() { // from class: com.kubi.assets.view.tab.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11325s0.m20156o0();
            }
        })});
    }

    /* JADX INFO: renamed from: L */
    public static final CharSequence m20112L() {
        return C27017c.f54310a.m66516f(R$string.save_account_label, new Object[0]);
    }

    /* JADX INFO: renamed from: N */
    public static final Fragment m20114N() {
        return AssetV2SpotFragment.f18811b0.newInstance();
    }

    /* JADX INFO: renamed from: O */
    public static final CharSequence m20115O() {
        return C27017c.f54310a.m66516f(R$string.trading, new Object[0]);
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m20116P() {
        return C24129b.m58030b(SiteVisibleConfigKey.Margin);
    }

    /* JADX INFO: renamed from: Q */
    public static final Fragment m20117Q() {
        return AssetV2MarginFragment.f17976a0.newInstance();
    }

    /* JADX INFO: renamed from: R */
    public static final CharSequence m20118R() {
        return C27017c.f54310a.m66516f(R$string.lever_margin, new Object[0]);
    }

    /* JADX INFO: renamed from: T */
    public static final Fragment m20120T() {
        return AssetFuturesCoinsFragment.f17558c0.newInstance();
    }

    /* JADX INFO: renamed from: U */
    public static final CharSequence m20121U() {
        return C27017c.f54310a.m66516f(R$string.futures, new Object[0]);
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m20123W() {
        return AssetsDepend.f18689a.m19185f().mo50712o() && C46392a.m102322d(C42153h.f93593a.m92499C(), false);
    }

    /* JADX INFO: renamed from: X */
    public static final Fragment m20124X() {
        return AlphaFragment.f16428Z.newInstance();
    }

    /* JADX INFO: renamed from: Y */
    public static final CharSequence m20125Y() {
        return C27017c.f54310a.m66516f(R$string.asset_alpha_title, new Object[0]);
    }

    /* JADX INFO: renamed from: Z */
    public static final boolean m20126Z() {
        return C24129b.m58030b(SiteVisibleConfigKey.TradingBot);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Fragment m20128a0() {
        return BotAssetContainerFragment.f16839W.newInstance();
    }

    /* JADX INFO: renamed from: b0 */
    public static final CharSequence m20130b0() {
        return C27017c.f54310a.m66516f(R$string.kc_tb_asset_bot, new Object[0]);
    }

    /* JADX INFO: renamed from: c0 */
    public static final boolean m20132c0() {
        return C24129b.m58030b(SiteVisibleConfigKey.Financing);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Fragment m20134d0() {
        return FinanceFragment.f17382b0.newInstance();
    }

    /* JADX INFO: renamed from: e0 */
    public static final CharSequence m20136e0() {
        return C27017c.f54310a.m66516f(AccountType.FINANCE.getNickNameRes(), new Object[0]);
    }

    /* JADX INFO: renamed from: f0 */
    public static final boolean m20138f0() {
        return C24129b.m58030b(SiteVisibleConfigKey.Option);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Fragment m20140g0() {
        return AssetOverviewFragment.f18179i0.newInstance();
    }

    /* JADX INFO: renamed from: h0 */
    public static final Fragment m20142h0() {
        return OptionsAssetMainFragment.f18153W.newInstance();
    }

    /* JADX INFO: renamed from: i0 */
    public static final CharSequence m20144i0() {
        return C27017c.f54310a.m66516f(R$string.kc_options_title, new Object[0]);
    }

    /* JADX INFO: renamed from: j0 */
    public static final boolean m20146j0() {
        return C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING);
    }

    /* JADX INFO: renamed from: k0 */
    public static final Fragment m20148k0() {
        return CloudMiningFragment.f16843W.instance(BundleKt.bundleOf(new Pair(Constants.BIZ, "cloudmining"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "kucoin_cloud_mining_rn"), new Pair("route", "CloudMiningAccount")));
    }

    /* JADX INFO: renamed from: l0 */
    public static final CharSequence m20150l0() {
        return C27017c.f54310a.m66516f(R$string.kc_account_name_mining, new Object[0]);
    }

    /* JADX INFO: renamed from: m0 */
    public static final boolean m20152m0() {
        return AssetsDepend.f18689a.m19181a().mo20634o();
    }

    /* JADX INFO: renamed from: n0 */
    public static final Fragment m20154n0() {
        return ICopyTradingService.f19723a.get().mo20633n();
    }

    /* JADX INFO: renamed from: o0 */
    public static final CharSequence m20156o0() {
        return C27017c.f54310a.m66516f(R$string.copytd_copy_trading, new Object[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public static final CharSequence m20158p0() {
        return C27017c.f54310a.m66516f(R$string.assets_overview, new Object[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public static final boolean m20160q0() {
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        return companion.get().mo64991e() || companion.get().mo64979C();
    }

    /* JADX INFO: renamed from: r0 */
    public static final Fragment m20162r0() {
        return AssetUnifiedFragment.f18918d0.newInstance();
    }

    /* JADX INFO: renamed from: s0 */
    public static final CharSequence m20164s0() {
        return C27017c.f54310a.m66516f(R$string.kc_unify_account, new Object[0]);
    }

    /* JADX INFO: renamed from: u0 */
    public static final Fragment m20168u0() {
        return AssetV2MainFragment.f17905b0.newInstance();
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public static final List<String> m20170v0() {
        return CollectionsKt.listOf((Object[]) new String[]{"overview", "main", "trade", ViewProps.MARGIN, SearchCategory$Companion.FUTURES, "bots", "finance", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "copyTrading", "unified"});
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public static final List<String> m20172w0() {
        return CollectionsKt.listOf((Object[]) new String[]{"overview", "main", "trade", ViewProps.MARGIN, SearchCategory$Companion.FUTURES, "bots", "finance", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "copyTrading"});
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public static final List<String> m20174x0() {
        return CollectionsKt.listOf((Object[]) new String[]{"overview", "main", "unified", ViewProps.MARGIN, "bots", "finance", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "copyTrading", "trade", SearchCategory$Companion.FUTURES});
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public static final List<TabItem> m20176y0(@NotNull List<TabItem> sourceTabs) {
        Intrinsics.checkNotNullParameter(sourceTabs, "sourceTabs");
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(companion.get().mo64979C() ? m20174x0() : companion.get().mo64991e() ? m20170v0() : m20172w0());
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            Pair pairM90091to = TuplesKt.m90091to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return CollectionsKt.sortedWith(sourceTabs, new a(linkedHashMap));
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m20119S() {
        return C9459a.m15238a();
    }
}
