package com.kubi.operation.lib.realtimev2.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import at.C4388d;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24275u;
import com.kubi.sdk.util.CountDownCallback;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CommonRealtimeAdapter.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002$%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001aH\u0002J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006&"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter;", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "Lcom/kubi/sdk/util/CountDownCallback;", "<init>", "()V", "countDownRefs", "Ljava/util/HashSet;", "Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter$CountDownRef;", "Lkotlin/collections/HashSet;", "countDownTaskId", "", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "layoutResId", "getLayoutResId", "()I", "layoutDialogResId", "getLayoutDialogResId", "onBindView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "data", "Lcom/kubi/home/realtime/AdapterViewType;", "renderItem", "itemView", "bindRightTv", "applyCountDown", "tv", "Lcom/kubi/resources/widget/BaseTextView;", "countDown", "remainingSecond", "", "Companion", "CountDownRef", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonRealtimeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRealtimeAdapter.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,208:1\n774#2:209\n865#2,2:210\n774#2:212\n865#2,2:213\n1869#2,2:215\n470#3:217\n*S KotlinDebug\n*F\n+ 1 CommonRealtimeAdapter.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter\n*L\n165#1:209\n165#1:210,2\n168#1:212\n168#1:213,2\n178#1:215,2\n129#1:217\n*E\n"})
public final class CommonRealtimeAdapter implements IRealTimeAdapter<DynamicCardItemEntity>, CountDownCallback {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f36794g = new Companion(null);

    /* JADX INFO: renamed from: c */
    public int f36796c;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final HashSet<CountDownRef> f36795b = new HashSet<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final RealTimeViewType f36797d = RealTimeViewType.COMMON;

    /* JADX INFO: renamed from: e */
    public final int f36798e = R$layout.operation_item_realtime_common;

    /* JADX INFO: renamed from: f */
    public final int f36799f = R$layout.operation_item_realtime_common_dialog;

    /* JADX INFO: compiled from: CommonRealtimeAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter$Companion;", "", "<init>", "()V", "TAG", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.realtimev2.common.CommonRealtimeAdapter$a, reason: from toString */
    /* JADX INFO: compiled from: CommonRealtimeAdapter.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeAdapter$CountDownRef;", "", "tvRef", "Ljava/lang/ref/WeakReference;", "Landroid/widget/TextView;", "template", "", "data", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;)V", "getTvRef", "()Ljava/lang/ref/WeakReference;", "getTemplate", "()Ljava/lang/String;", "getData", "()Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CountDownRef {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final WeakReference<TextView> tvRef;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String template;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final DynamicCardItemEntity data;

        public CountDownRef(@NotNull WeakReference<TextView> tvRef, @NotNull String template, @NotNull DynamicCardItemEntity data) {
            Intrinsics.checkNotNullParameter(tvRef, "tvRef");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            this.tvRef = tvRef;
            this.template = template;
            this.data = data;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DynamicCardItemEntity getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTemplate() {
            return this.template;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final WeakReference<TextView> m43548c() {
            return this.tvRef;
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof CountDownRef ? Intrinsics.areEqual(((CountDownRef) other).tvRef.get(), this.tvRef.get()) : super.equals(other);
        }

        public int hashCode() {
            TextView textView = this.tvRef.get();
            if (textView != null) {
                return textView.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "CountDownRef(tvRef=" + this.tvRef + ", template=" + this.template + ", data=" + this.data + ')';
        }
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getF26178c() {
        return this.f36798e;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getF26179d() {
        return this.f36799f;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public RealTimeViewType getF26177b() {
        return this.f36797d;
    }

    /* JADX INFO: renamed from: l */
    public final void m43543l(View view, final DynamicCardItemEntity dynamicCardItemEntity) {
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvStatusBtn);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvStatus);
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66700o(baseTextView);
        Intrinsics.checkNotNull(baseTextView2);
        C27046k.m66700o(baseTextView2);
        String btnTxt = dynamicCardItemEntity.getBtnTxt();
        if (btnTxt == null || btnTxt.length() == 0) {
            return;
        }
        String btnUrl = dynamicCardItemEntity.getBtnUrl();
        final BaseTextView baseTextView3 = (btnUrl == null || btnUrl.length() == 0) ? baseTextView2 : baseTextView;
        C27046k.m66685H(baseTextView3);
        baseTextView3.setText(dynamicCardItemEntity.getBtnTxt());
        String btnUrl2 = dynamicCardItemEntity.getBtnUrl();
        if (btnUrl2 == null || btnUrl2.length() == 0) {
            baseTextView3.setOnClickListener(null);
            baseTextView3.setClickable(false);
        } else {
            baseTextView3.setClickable(true);
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.operation.lib.realtimev2.common.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommonRealtimeAdapter.m43538m(dynamicCardItemEntity);
                }
            }, 1, null);
        }
        String showBtnBgColor = dynamicCardItemEntity.getShowBtnBgColor();
        if (showBtnBgColor != null) {
            C4388d.m3992a(baseTextView3, showBtnBgColor);
        }
        final String showBtnColor = dynamicCardItemEntity.getShowBtnColor();
        if (showBtnColor != null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.realtimev2.common.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommonRealtimeAdapter.m43539n(baseTextView3, showBtnColor);
                }
            });
        }
    }

    @Override // com.kubi.sdk.util.CountDownCallback
    /* JADX INFO: renamed from: l2 */
    public void mo20702l2(long j11) {
        synchronized (this.f36795b) {
            try {
                HashSet<CountDownRef> hashSet = this.f36795b;
                ArrayList<CountDownRef> arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    CountDownRef countDownRef = (CountDownRef) obj;
                    if (countDownRef.m43548c().get() != null && countDownRef.getData().isCountDown()) {
                        arrayList.add(obj);
                    }
                }
                HashSet<CountDownRef> hashSet2 = this.f36795b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : hashSet2) {
                    CountDownRef countDownRef2 = (CountDownRef) obj2;
                    if (countDownRef2.m43548c().get() != null && !countDownRef2.getData().isCountDown()) {
                        arrayList2.add(obj2);
                    }
                }
                this.f36795b.clear();
                this.f36795b.addAll(arrayList);
                if (this.f36795b.isEmpty()) {
                    TimeSyncManager.f48123a.m58369s(this.f36796c);
                    return;
                }
                for (CountDownRef countDownRef3 : arrayList) {
                    TextView textView = countDownRef3.m43548c().get();
                    if (textView != null) {
                        textView.setText(countDownRef3.getTemplate());
                        C4388d.m3998g(textView, 0, 1, null);
                        CharSequence text = textView.getText();
                        String string = text != null ? text.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        C4388d.m3996e(textView, string, countDownRef3.getData().getCountDownSeconds());
                    }
                }
                if (!arrayList2.isEmpty()) {
                    CommonRealtimeDataHelper.f36803a.m43561l();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo30049e(@NotNull View view, @NotNull DynamicCardItemEntity data, @NotNull AdapterViewType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        m43545p(view, data, type);
    }

    /* JADX INFO: renamed from: p */
    public final void m43545p(final View view, final DynamicCardItemEntity dynamicCardItemEntity, final AdapterViewType adapterViewType) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.realtimev2.common.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonRealtimeAdapter.m43540q(view, this, dynamicCardItemEntity, adapterViewType);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m43538m(DynamicCardItemEntity dynamicCardItemEntity) {
        RouteExKt.m56217H(dynamicCardItemEntity.getBtnUrl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m43539n(BaseTextView baseTextView, String str) {
        baseTextView.setTextColor(Color.parseColor(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m43540q(View view, CommonRealtimeAdapter commonRealtimeAdapter, final DynamicCardItemEntity dynamicCardItemEntity, final AdapterViewType adapterViewType) {
        Context context = view.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        ImageView imageView = (ImageView) view.findViewById(R$id.ivIcon);
        String str = "";
        if (imageView != null) {
            String strShowIcon = dynamicCardItemEntity.showIcon();
            if (strShowIcon == null) {
                strShowIcon = "";
            }
            if (strShowIcon.length() == 0) {
                C27046k.m66700o(imageView);
            } else {
                C46341d c46341dM102151a = C46338a.m102151a(context);
                Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
                C46340c<Object> c46340cM58535a = C24275u.m58535a(c46341dM102151a, strShowIcon);
                C42032f c42032f = new C42032f();
                int i11 = R$mipmap.ic_placeholder;
                c46340cM58535a.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0(imageView);
                C27046k.m66685H(imageView);
            }
        }
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvTitle);
        String title = dynamicCardItemEntity.getTitle();
        if (title == null) {
            title = "";
        }
        baseTextView.setText(title);
        Intrinsics.checkNotNull(baseTextView);
        C4388d.m3998g(baseTextView, 0, 1, null);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvSubTitle);
        String subTitle = dynamicCardItemEntity.getSubTitle();
        if (subTitle != null) {
            str = subTitle;
        }
        baseTextView2.setText(str);
        Intrinsics.checkNotNull(baseTextView2);
        C4388d.m3997f(baseTextView2, R$color.c_text40);
        commonRealtimeAdapter.m43542k(baseTextView2, dynamicCardItemEntity);
        commonRealtimeAdapter.m43543l(view, dynamicCardItemEntity);
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.operation.lib.realtimev2.common.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonRealtimeAdapter.m43541r(dynamicCardItemEntity, adapterViewType);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m43541r(DynamicCardItemEntity dynamicCardItemEntity, AdapterViewType adapterViewType) throws JSONException {
        RouteExKt.m56217H(dynamicCardItemEntity.getCardUrl());
        if (adapterViewType == AdapterViewType.DIALOG) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", String.valueOf(dynamicCardItemEntity.getViewTypeV2()));
            String reportStatus = dynamicCardItemEntity.getReportStatus();
            if (reportStatus != null && reportStatus.length() != 0) {
                jSONObject.put("status", String.valueOf(dynamicCardItemEntity.getReportStatus()));
            }
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "realtimeUpdatesCardPop", null, jSONObject, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m43542k(BaseTextView baseTextView, DynamicCardItemEntity dynamicCardItemEntity) {
        String string = baseTextView.getText().toString();
        long countDownSeconds = dynamicCardItemEntity.getCountDownSeconds();
        synchronized (this.f36795b) {
            try {
                CountDownRef countDownRef = new CountDownRef(new WeakReference(baseTextView), string, dynamicCardItemEntity);
                this.f36795b.remove(countDownRef);
                if (C4388d.m3994c(string)) {
                    C4388d.m3996e(baseTextView, string, countDownSeconds);
                    if (dynamicCardItemEntity.isCountDown()) {
                        if (this.f36795b.isEmpty()) {
                            this.f36796c = TimeSyncManager.f48123a.m58359i(Long.MAX_VALUE, this, null);
                        }
                        this.f36795b.add(countDownRef);
                    }
                } else if (this.f36795b.isEmpty()) {
                    TimeSyncManager.f48123a.m58369s(this.f36796c);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
