package com.kubi.operation.lib.realtime.gempool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$drawable;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.util.C24275u;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p419l2.C42032f;
import p429lf.C42180b;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.operation.lib.realtime.gempool.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GemPoolRealtimeAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0019H\u0003R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeAdapter;", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "Lcom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeData;", "<init>", "()V", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "layoutResId", "", "getLayoutResId", "()I", "layoutDialogResId", "getLayoutDialogResId", "onBindView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "data", "Lcom/kubi/home/realtime/AdapterViewType;", "renderItem", "itemView", "dialogStyle", "", "Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGemPoolRealtimeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemPoolRealtimeAdapter.kt\ncom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class GemPoolRealtimeAdapter implements IRealTimeAdapter<GemPoolRealtimeData> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RealTimeViewType f36789b = RealTimeViewType.GEM_POOL;

    /* JADX INFO: renamed from: c */
    public final int f36790c = R$layout.operation_item_realtime_gempool_home;

    /* JADX INFO: renamed from: d */
    public final int f36791d = R$layout.operation_item_realtime_gempool_dialog;

    /* JADX INFO: renamed from: l */
    public static final Unit m43529l(View view, boolean z11, final GempoolItemEntity gempoolItemEntity) {
        String strM92640e;
        ImageView imageView;
        Context context = view.getContext();
        if (z11 && (imageView = (ImageView) view.findViewById(R$id.ivLogo)) != null) {
            C46341d c46341dM102151a = C46338a.m102151a(context);
            Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
            String earnTokenLogo = gempoolItemEntity.getEarnTokenLogo();
            if (earnTokenLogo == null) {
                earnTokenLogo = "";
            }
            C46340c<Object> c46340cM58535a = C24275u.m58535a(c46341dM102151a, earnTokenLogo);
            C42032f c42032f = new C42032f();
            int i11 = R$mipmap.ic_placeholder;
            c46340cM58535a.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0(imageView);
        }
        TextView textView = (TextView) view.findViewById(R$id.tvTitle);
        String earnTokenName = gempoolItemEntity.getEarnTokenName();
        if (earnTokenName == null) {
            earnTokenName = "";
        }
        String str = "--";
        if (earnTokenName.length() == 0) {
            earnTokenName = "--";
        }
        textView.setText("GemPool (" + earnTokenName + ')');
        Intrinsics.checkNotNull(textView);
        C24256n1.m58512b(textView);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvSubTitle);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvStatus);
        List<GempoolItemPoolEntity> pools = gempoolItemEntity.getPools();
        if (pools == null) {
            pools = CollectionsKt.emptyList();
        }
        List<GempoolItemPoolEntity> list = pools;
        if (gempoolItemEntity.isOngoing() && !list.isEmpty()) {
            C27046k.m66685H(view);
            baseTextView.setText(context.getString(R$string.gempool_ongoing, CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.kubi.operation.lib.realtime.gempool.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GemPoolRealtimeAdapter.m43530m((GempoolItemPoolEntity) obj);
                }
            }, 30, null)));
            baseTextView2.setText(R$string.gempool_state_ongoing);
            Intrinsics.checkNotNull(context);
            baseTextView2.setTextColor(C27046k.m66699n(context, R$color.brandGreen));
            baseTextView2.setBackgroundResource(R$drawable.shape_primary8_6r);
        } else if (gempoolItemEntity.isFinished()) {
            C27046k.m66685H(view);
            BigDecimal bigDecimalM66671k = C27041f.m66671k(gempoolItemEntity.getSummaryEarnedAmount());
            if (bigDecimalM66671k != null && (strM92640e = C42180b.m92640e(bigDecimalM66671k, null, bigDecimalM66671k.scale(), false, false, false, 0, null, 125, null)) != null) {
                str = strM92640e;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(' ');
            String earnTokenName2 = gempoolItemEntity.getEarnTokenName();
            sb2.append(earnTokenName2 != null ? earnTokenName2 : "");
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.gempool_finish, C42828b.m93915p(sb2.toString())));
            baseTextView2.setText(R$string.gempool_state_finish);
            Intrinsics.checkNotNull(context);
            baseTextView2.setTextColor(C27046k.m66699n(context, R$color.c_text40));
            baseTextView2.setBackgroundResource(R$drawable.shape_cover4_6r);
        } else {
            ViewExtKt.m66577h(view);
        }
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        highlightTextHelper.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.brandGreen)));
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.operation.lib.realtime.gempool.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GemPoolRealtimeAdapter.m43531n(gempoolItemEntity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m43530m(GempoolItemPoolEntity it) {
        String strM92640e;
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal bigDecimalM66671k = C27041f.m66671k(it.getStakingAmount());
        if (bigDecimalM66671k == null || (strM92640e = C42180b.m92640e(bigDecimalM66671k, null, bigDecimalM66671k.scale(), false, false, false, 0, null, 125, null)) == null) {
            strM92640e = "--";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM92640e);
        sb2.append(' ');
        String stakingToken = it.getStakingToken();
        if (stakingToken == null) {
            stakingToken = "";
        }
        sb2.append(stakingToken);
        return sb2.toString();
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getF26178c() {
        return this.f36790c;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getF26179d() {
        return this.f36791d;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public RealTimeViewType getF26177b() {
        return this.f36789b;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo30049e(@NotNull View view, @NotNull GemPoolRealtimeData data, @NotNull AdapterViewType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        GempoolItemEntity entity = data.getEntity();
        if (entity != null) {
            m43533k(view, type == AdapterViewType.DIALOG, entity);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m43533k(final View view, final boolean z11, final GempoolItemEntity gempoolItemEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.realtime.gempool.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GemPoolRealtimeAdapter.m43529l(view, z11, gempoolItemEntity);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m43531n(GempoolItemEntity gempoolItemEntity) {
        String detailUrl = gempoolItemEntity.getDetailUrl();
        if (detailUrl != null) {
            RouteExKt.m56217H(detailUrl);
        }
        return Unit.INSTANCE;
    }
}
