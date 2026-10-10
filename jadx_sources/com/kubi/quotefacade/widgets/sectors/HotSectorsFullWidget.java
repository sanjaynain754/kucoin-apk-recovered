package com.kubi.quotefacade.widgets.sectors;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bv.C4652a1;
import com.blankj.utilcode.util.C5272h;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerFullCard;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HotSectorsFullWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0016\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J8\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\rH\u0002J \u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001aH\u0002J\u0018\u0010=\u001a\u0002082\u0006\u00109\u001a\u00020\r2\u0006\u0010>\u001a\u00020?H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsFullBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsFullBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "dataList", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "bindSubSector", "ctx", "Landroid/content/Context;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "tvName", "Lcom/kubi/resources/widget/BaseTextView;", "tvRate", "item", "bgType", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget$SubBgType;", "jumpToPlateDetail", "tagId", "", "radius", "", "topBg", "Landroid/graphics/drawable/GradientDrawable;", "color", "subBg", "bottomLeft", "bottomRight", "bgDrawable", "radii", "", "SubBgType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHotSectorsFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSectorsFullWidget.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,269:1\n147#2,16:270\n153#3,7:286\n93#4,4:293\n35#5,4:297\n39#5:303\n44#6,2:301\n*S KotlinDebug\n*F\n+ 1 HotSectorsFullWidget.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget\n*L\n70#1:270,16\n94#1:286,7\n104#1:293,4\n233#1:297,4\n233#1:303\n233#1:301,2\n*E\n"})
public final class HotSectorsFullWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f42929Z = {Reflection.property1(new PropertyReference1Impl(HotSectorsFullWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsFullBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42930X = C45681e.m100799e(this, new Function1<HotSectorsFullWidget, C4652a1>() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4652a1 invoke(@NotNull HotSectorsFullWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4652a1.m4616a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4652a1, Unit>() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4652a1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4652a1 c4652a1) {
            invoke(c4652a1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public final float f42931Y = C27040e.m66657a(8.0f);

    /* JADX INFO: compiled from: HotSectorsFullWidget.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget$SubBgType;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY", "LEFT", "MID", "RIGHT", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum SubBgType {
        ONLY,
        LEFT,
        MID,
        RIGHT;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f42933c = EnumEntriesKt.enumEntries(m53674a());

        @NotNull
        public static EnumEntries<SubBgType> getEntries() {
            return f42933c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$b */
    /* JADX INFO: compiled from: HotSectorsFullWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/widgets/sectors/HotSectorsFullWidget$getViewModeFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22698b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new HotSectorsWidgetVM(4);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22700c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: E3 */
    public final GradientDrawable m53669E3(int i11, boolean z11, boolean z12) {
        float f11 = z11 ? this.f42931Y : 0.0f;
        float f12 = z12 ? this.f42931Y : 0.0f;
        return m53671s3(i11, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f11, f11});
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$a */
    /* JADX INFO: compiled from: HotSectorsFullWidget.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C22697a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubBgType.values().length];
            try {
                iArr[SubBgType.ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubBgType.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubBgType.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubBgType.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: B3 */
    private final void m53652B3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsFullWidget.m53653C3(this.f42942b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m53654D3(C4652a1 c4652a1, HotSectorsFullWidget hotSectorsFullWidget) {
        c4652a1.f4211k.setLoading(true);
        hotSectorsFullWidget.sendIntent(HotSectorsContract$UiIntent.LoadData.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m53663u3(final ChancePlateItem chancePlateItem, Context context, BaseTextView baseTextView, BaseTextView baseTextView2, View view, SubBgType subBgType, final HotSectorsFullWidget hotSectorsFullWidget) {
        GradientDrawable gradientDrawableM53669E3;
        String avgChangeRate = chancePlateItem.getAvgChangeRate();
        BigDecimal bigDecimalM66671k = avgChangeRate != null ? C27041f.m66671k(avgChangeRate) : null;
        int iM54278c = C22890g.m54278c(context, C27039d.m66647g(bigDecimalM66671k), R$color.c_text40);
        baseTextView.setText(chancePlateItem.getTitle());
        baseTextView2.setText(C42180b.m92649n(C42828b.m93915p(C42828b.m93911l(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null) : null))));
        baseTextView2.setTextColor(iM54278c);
        int iM6229a = C5272h.m6229a(iM54278c, 0.04f);
        int i11 = C22697a.$EnumSwitchMapping$0[subBgType.ordinal()];
        if (i11 == 1) {
            gradientDrawableM53669E3 = hotSectorsFullWidget.m53669E3(iM6229a, true, true);
        } else if (i11 == 2) {
            gradientDrawableM53669E3 = hotSectorsFullWidget.m53669E3(iM6229a, true, false);
        } else if (i11 == 3) {
            gradientDrawableM53669E3 = hotSectorsFullWidget.m53669E3(iM6229a, false, false);
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            gradientDrawableM53669E3 = hotSectorsFullWidget.m53669E3(iM6229a, false, true);
        }
        view.setBackground(gradientDrawableM53669E3);
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsFullWidget.m53664v3(this.f42957b, chancePlateItem);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m53665w3(final List<ChancePlateItem> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsFullWidget.m53666x3(this.f42944b, list);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53666x3(final HotSectorsFullWidget hotSectorsFullWidget, List list) {
        BaseTextView baseTextView;
        String strJoinToString$default;
        C4652a1 c4652a1M53673z3 = hotSectorsFullWidget.m53673z3();
        if (c4652a1M53673z3 == null) {
            return Unit.INSTANCE;
        }
        Context context = c4652a1M53673z3.getRoot().getContext();
        hotSectorsFullWidget.m53652B3(false);
        final ChancePlateItem chancePlateItem = (ChancePlateItem) CollectionsKt.getOrNull(list, 0);
        if (chancePlateItem != null) {
            String avgChangeRate = chancePlateItem.getAvgChangeRate();
            String str = null;
            BigDecimal bigDecimalM66671k = avgChangeRate != null ? C27041f.m66671k(avgChangeRate) : null;
            Intrinsics.checkNotNull(context);
            int iM54278c = C22890g.m54278c(context, C27039d.m66647g(bigDecimalM66671k), R$color.c_text40);
            c4652a1M53673z3.f4213m.setText(chancePlateItem.getTitle());
            BaseTextView baseTextView2 = c4652a1M53673z3.f4217q;
            if (bigDecimalM66671k != null) {
                String strM92642g = C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null);
                baseTextView = baseTextView2;
                str = strM92642g;
            } else {
                baseTextView = baseTextView2;
            }
            baseTextView.setText(C42180b.m92649n(C42828b.m93915p(C42828b.m93911l(str))));
            c4652a1M53673z3.f4217q.setTextColor(iM54278c);
            BaseTextView baseTextView3 = c4652a1M53673z3.f4212l;
            List<String> hotCurrencyNameList = chancePlateItem.getHotCurrencyNameList();
            if (hotCurrencyNameList == null || (strJoinToString$default = CollectionsKt.joinToString$default(hotCurrencyNameList, "、", null, null, 0, null, null, 62, null)) == null) {
                strJoinToString$default = "";
            }
            baseTextView3.setText(strJoinToString$default);
            c4652a1M53673z3.f4205e.setBackground(hotSectorsFullWidget.m53670F3(C5272h.m6229a(iM54278c, 0.04f)));
            ConstraintLayout layoutSector1 = c4652a1M53673z3.f4205e;
            Intrinsics.checkNotNullExpressionValue(layoutSector1, "layoutSector1");
            C27046k.m66710y(layoutSector1, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotSectorsFullWidget.m53667y3(this.f42946b, chancePlateItem);
                }
            });
        }
        List listTake = CollectionsKt.take(CollectionsKt.drop(list, 1), 3);
        int size = listTake.size();
        ConstraintLayout layoutSector3 = c4652a1M53673z3.f4207g;
        Intrinsics.checkNotNullExpressionValue(layoutSector3, "layoutSector3");
        C27046k.m66700o(layoutSector3);
        ConstraintLayout layoutSector4 = c4652a1M53673z3.f4208h;
        Intrinsics.checkNotNullExpressionValue(layoutSector4, "layoutSector4");
        C27046k.m66700o(layoutSector4);
        if (size == 0) {
            LinearLayout layoutSubSectors = c4652a1M53673z3.f4210j;
            Intrinsics.checkNotNullExpressionValue(layoutSubSectors, "layoutSubSectors");
            C27046k.m66700o(layoutSubSectors);
        } else if (size == 1) {
            LinearLayout layoutSubSectors2 = c4652a1M53673z3.f4210j;
            Intrinsics.checkNotNullExpressionValue(layoutSubSectors2, "layoutSubSectors");
            C27046k.m66685H(layoutSubSectors2);
            Intrinsics.checkNotNull(context);
            ConstraintLayout layoutSector2 = c4652a1M53673z3.f4206f;
            Intrinsics.checkNotNullExpressionValue(layoutSector2, "layoutSector2");
            BaseTextView tvName2 = c4652a1M53673z3.f4214n;
            Intrinsics.checkNotNullExpressionValue(tvName2, "tvName2");
            BaseTextView tvRate2 = c4652a1M53673z3.f4218r;
            Intrinsics.checkNotNullExpressionValue(tvRate2, "tvRate2");
            hotSectorsFullWidget.m53672t3(context, layoutSector2, tvName2, tvRate2, (ChancePlateItem) listTake.get(0), SubBgType.ONLY);
        } else if (size != 2) {
            LinearLayout layoutSubSectors3 = c4652a1M53673z3.f4210j;
            Intrinsics.checkNotNullExpressionValue(layoutSubSectors3, "layoutSubSectors");
            C27046k.m66685H(layoutSubSectors3);
            Intrinsics.checkNotNull(context);
            ConstraintLayout layoutSector5 = c4652a1M53673z3.f4206f;
            Intrinsics.checkNotNullExpressionValue(layoutSector5, "layoutSector2");
            BaseTextView tvName3 = c4652a1M53673z3.f4214n;
            Intrinsics.checkNotNullExpressionValue(tvName3, "tvName2");
            BaseTextView tvRate3 = c4652a1M53673z3.f4218r;
            Intrinsics.checkNotNullExpressionValue(tvRate3, "tvRate2");
            hotSectorsFullWidget.m53672t3(context, layoutSector5, tvName3, tvRate3, (ChancePlateItem) listTake.get(0), SubBgType.LEFT);
            ConstraintLayout layoutSector6 = c4652a1M53673z3.f4207g;
            Intrinsics.checkNotNullExpressionValue(layoutSector6, "layoutSector3");
            C27046k.m66685H(layoutSector6);
            ConstraintLayout layoutSector7 = c4652a1M53673z3.f4207g;
            Intrinsics.checkNotNullExpressionValue(layoutSector7, "layoutSector3");
            BaseTextView tvName4 = c4652a1M53673z3.f4215o;
            Intrinsics.checkNotNullExpressionValue(tvName4, "tvName3");
            BaseTextView tvRate4 = c4652a1M53673z3.f4219s;
            Intrinsics.checkNotNullExpressionValue(tvRate4, "tvRate3");
            hotSectorsFullWidget.m53672t3(context, layoutSector7, tvName4, tvRate4, (ChancePlateItem) listTake.get(1), SubBgType.MID);
            ConstraintLayout layoutSector8 = c4652a1M53673z3.f4208h;
            Intrinsics.checkNotNullExpressionValue(layoutSector8, "layoutSector4");
            C27046k.m66685H(layoutSector8);
            ConstraintLayout layoutSector9 = c4652a1M53673z3.f4208h;
            Intrinsics.checkNotNullExpressionValue(layoutSector9, "layoutSector4");
            BaseTextView tvName5 = c4652a1M53673z3.f4216p;
            Intrinsics.checkNotNullExpressionValue(tvName5, "tvName4");
            BaseTextView tvRate5 = c4652a1M53673z3.f4220t;
            Intrinsics.checkNotNullExpressionValue(tvRate5, "tvRate4");
            hotSectorsFullWidget.m53672t3(context, layoutSector9, tvName5, tvRate5, (ChancePlateItem) listTake.get(2), SubBgType.RIGHT);
        } else {
            LinearLayout layoutSubSectors4 = c4652a1M53673z3.f4210j;
            Intrinsics.checkNotNullExpressionValue(layoutSubSectors4, "layoutSubSectors");
            C27046k.m66685H(layoutSubSectors4);
            Intrinsics.checkNotNull(context);
            ConstraintLayout layoutSector10 = c4652a1M53673z3.f4206f;
            Intrinsics.checkNotNullExpressionValue(layoutSector10, "layoutSector2");
            BaseTextView tvName6 = c4652a1M53673z3.f4214n;
            Intrinsics.checkNotNullExpressionValue(tvName6, "tvName2");
            BaseTextView tvRate6 = c4652a1M53673z3.f4218r;
            Intrinsics.checkNotNullExpressionValue(tvRate6, "tvRate2");
            hotSectorsFullWidget.m53672t3(context, layoutSector10, tvName6, tvRate6, (ChancePlateItem) listTake.get(0), SubBgType.LEFT);
            ConstraintLayout layoutSector11 = c4652a1M53673z3.f4207g;
            Intrinsics.checkNotNullExpressionValue(layoutSector11, "layoutSector3");
            C27046k.m66685H(layoutSector11);
            ConstraintLayout layoutSector12 = c4652a1M53673z3.f4207g;
            Intrinsics.checkNotNullExpressionValue(layoutSector12, "layoutSector3");
            BaseTextView tvName7 = c4652a1M53673z3.f4215o;
            Intrinsics.checkNotNullExpressionValue(tvName7, "tvName3");
            BaseTextView tvRate7 = c4652a1M53673z3.f4219s;
            Intrinsics.checkNotNullExpressionValue(tvRate7, "tvRate3");
            hotSectorsFullWidget.m53672t3(context, layoutSector12, tvName7, tvRate7, (ChancePlateItem) listTake.get(1), SubBgType.RIGHT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final void m53668A3(String str) {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22700c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_rn_plate", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66567e((Boolean) objM20457a, false)) {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "discover/plate?tagId=" + str, false, null, 6, null);
            return;
        }
        String strEncode = Uri.encode("PlateDetailPage?tagId=" + str + "&preSpmId=" + C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, HomeWidgetCode.HotSections.getCode(), null, 4, null));
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&disableAddHome=1&route=");
        sb2.append(strEncode);
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: F3 */
    public final GradientDrawable m53670F3(int i11) {
        float f11 = this.f42931Y;
        return m53671s3(i11, new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22706b) {
            m53652B3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_hot_sectors_full;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public ViewModelProvider.Factory getViewModeFactory() {
        return new C22698b();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<HotSectorsWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(HotSectorsWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        C4652a1 c4652a1M53673z3 = m53673z3();
        if (c4652a1M53673z3 == null || (baseTextView = c4652a1M53673z3.f4221u) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    /* JADX INFO: renamed from: s3 */
    public final GradientDrawable m53671s3(int i11, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: t3 */
    public final void m53672t3(final Context context, final View view, final BaseTextView baseTextView, final BaseTextView baseTextView2, final ChancePlateItem chancePlateItem, final SubBgType subBgType) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsFullWidget.m53663u3(chancePlateItem, context, baseTextView, baseTextView2, view, subBgType, this);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final C4652a1 m53673z3() {
        return (C4652a1) this.f42930X.getValue(this, f42929Z[0]);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m53653C3(final HotSectorsFullWidget hotSectorsFullWidget, boolean z11) {
        final C4652a1 c4652a1M53673z3 = hotSectorsFullWidget.m53673z3();
        if (c4652a1M53673z3 == null) {
            return Unit.INSTANCE;
        }
        c4652a1M53673z3.f4209i.m54970c();
        c4652a1M53673z3.f4211k.setLoading(false);
        if (z11) {
            Group groupContent = c4652a1M53673z3.f4202b;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4652a1M53673z3.f4211k;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4652a1M53673z3.f4211k;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotSectorsFullWidget.m53654D3(c4652a1M53673z3, hotSectorsFullWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4652a1M53673z3.f4202b;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4652a1M53673z3.f4211k;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m53664v3(HotSectorsFullWidget hotSectorsFullWidget, ChancePlateItem chancePlateItem) throws JSONException {
        hotSectorsFullWidget.m53668A3(chancePlateItem.getTagId());
        String code = HomeWidgetCode.HotSections.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("name", C27041f.m66668h(chancePlateItem.getTitle()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m53667y3(HotSectorsFullWidget hotSectorsFullWidget, ChancePlateItem chancePlateItem) throws JSONException {
        hotSectorsFullWidget.m53668A3(chancePlateItem.getTagId());
        String code = HomeWidgetCode.HotSections.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("name", C27041f.m66668h(chancePlateItem.getTitle()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new C22699xe3449ee2("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsFullWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new HotSectorsFullWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        HomeShimmerFullCard homeShimmerFullCard;
        super.initView();
        C4652a1 c4652a1M53673z3 = m53673z3();
        if (c4652a1M53673z3 != null && (homeShimmerFullCard = c4652a1M53673z3.f4209i) != null) {
            homeShimmerFullCard.m54971e();
        }
        C4652a1 c4652a1M53673z4 = m53673z3();
        if (c4652a1M53673z4 != null && (constraintLayout4 = c4652a1M53673z4.f4205e) != null) {
            constraintLayout4.setBackground(m53670F3(getColorRes(R$color.c_cover2)));
        }
        C4652a1 c4652a1M53673z5 = m53673z3();
        if (c4652a1M53673z5 != null && (constraintLayout3 = c4652a1M53673z5.f4206f) != null) {
            constraintLayout3.setBackground(m53669E3(getColorRes(R$color.c_cover2), true, true));
        }
        C4652a1 c4652a1M53673z6 = m53673z3();
        if (c4652a1M53673z6 != null && (constraintLayout2 = c4652a1M53673z6.f4207g) != null) {
            constraintLayout2.setBackground(m53669E3(getColorRes(R$color.c_cover2), false, false));
        }
        C4652a1 c4652a1M53673z7 = m53673z3();
        if (c4652a1M53673z7 != null && (constraintLayout = c4652a1M53673z7.f4208h) != null) {
            constraintLayout.setBackground(m53669E3(getColorRes(R$color.c_cover2), false, true));
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(HotSectorsContract$UiIntent.LoadData.INSTANCE);
    }
}
