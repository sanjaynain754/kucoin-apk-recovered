package com.kubi.p072ad.service;

import android.net.Uri;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.app.p073ad.R$color;
import com.kubi.app.p073ad.R$dimen;
import com.kubi.app.p073ad.R$id;
import com.kubi.app.p073ad.R$layout;
import com.kubi.app.p073ad.R$string;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.resources.widget.CircleLoadingDrawable;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.io.File;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p668un.InterfaceC45269f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013JG\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122-\u0010\u0016\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/ad/service/SplashHockSPI;", "Lcom/kubi/launch/spi/ISplashHockSPI;", "<init>", "()V", "adJob", "Lkotlinx/coroutines/Job;", "tvTimer", "Landroid/widget/TextView;", "isClick", "", "delayTime", "", "checkAdAsync", "Lkotlin/Pair;", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "stubSplash", "Landroid/view/ViewStub;", "(Lcom/kubi/sdk/BaseActivity;Landroid/view/ViewStub;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAd", "", "onFinish", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handle", "showSmallLoading", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SplashHockSPI implements InterfaceC45269f {

    /* JADX INFO: renamed from: a */
    @Nullable
    public InterfaceC41775x1 f14940a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public TextView f14941b;

    /* JADX INFO: renamed from: c */
    public boolean f14942c;

    /* JADX INFO: renamed from: d */
    public final long f14943d = 1000;

    /* JADX INFO: renamed from: j */
    public static final Unit m14687j(SplashHockSPI splashHockSPI, Function1 function1, ResAdEntity resAdEntity) throws JSONException {
        splashHockSPI.f14942c = true;
        InterfaceC41775x1 interfaceC41775x1 = splashHockSPI.f14940a;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        function1.invoke(new Pair(Boolean.TRUE, C27041f.m66668h(resAdEntity.getUrl())));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", resAdEntity.getTitle());
        jSONObject.put("optionKey", resAdEntity.getLanguage());
        jSONObject.put("url", resAdEntity.getUrl());
        jSONObject.put("clickPosition", "enter");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("BTsplashPage", "startupAds", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m14688k(SplashHockSPI splashHockSPI, Function1 function1, ResAdEntity resAdEntity) throws JSONException {
        splashHockSPI.f14942c = true;
        InterfaceC41775x1 interfaceC41775x1 = splashHockSPI.f14940a;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        function1.invoke(new Pair(Boolean.TRUE, ""));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", resAdEntity.getTitle());
        jSONObject.put("optionKey", resAdEntity.getLanguage());
        jSONObject.put("url", resAdEntity.getUrl());
        jSONObject.put("clickPosition", "skip");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("BTsplashPage", "startupAds", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p668un.InterfaceC45269f
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo14689a(@NotNull BaseActivity baseActivity, @NotNull ViewStub viewStub, @NotNull Continuation<? super Pair<Boolean, String>> continuation) {
        SplashHockSPI$checkAdAsync$1 splashHockSPI$checkAdAsync$1;
        if (continuation instanceof SplashHockSPI$checkAdAsync$1) {
            splashHockSPI$checkAdAsync$1 = (SplashHockSPI$checkAdAsync$1) continuation;
            int i11 = splashHockSPI$checkAdAsync$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                splashHockSPI$checkAdAsync$1.label = i11 - Integer.MIN_VALUE;
            } else {
                splashHockSPI$checkAdAsync$1 = new SplashHockSPI$checkAdAsync$1(this, continuation);
            }
        } else {
            splashHockSPI$checkAdAsync$1 = new SplashHockSPI$checkAdAsync$1(this, continuation);
        }
        Object objM14679b = splashHockSPI$checkAdAsync$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = splashHockSPI$checkAdAsync$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM14679b);
            splashHockSPI$checkAdAsync$1.L$0 = baseActivity;
            splashHockSPI$checkAdAsync$1.L$1 = viewStub;
            splashHockSPI$checkAdAsync$1.label = 1;
            objM14679b = SplashAdReviewKt.m14679b(null, splashHockSPI$checkAdAsync$1, 1, null);
            if (objM14679b != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM14679b);
            return objM14679b;
        }
        viewStub = (ViewStub) splashHockSPI$checkAdAsync$1.L$1;
        baseActivity = (BaseActivity) splashHockSPI$checkAdAsync$1.L$0;
        ResultKt.throwOnFailure(objM14679b);
        if (!((Boolean) objM14679b).booleanValue()) {
            return TuplesKt.m90091to(Boxing.boxBoolean(false), "");
        }
        InterfaceC41634e interfaceC41634eM90913f = C41636g.m90913f(new SplashHockSPI$checkAdAsync$2(this, baseActivity, viewStub, null));
        splashHockSPI$checkAdAsync$1.L$0 = SpillingKt.nullOutSpilledVariable(baseActivity);
        splashHockSPI$checkAdAsync$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
        splashHockSPI$checkAdAsync$1.label = 2;
        Object objM90882F = C41636g.m90882F(interfaceC41634eM90913f, splashHockSPI$checkAdAsync$1);
        return objM90882F == coroutine_suspended ? coroutine_suspended : objM90882F;
    }

    /* JADX INFO: renamed from: i */
    public final void m14690i(BaseActivity baseActivity, ViewStub viewStub, final Function1<? super Pair<Boolean, String>, Unit> function1) throws JSONException {
        final ResAdEntity resAdEntityM14652e = AdManager.f14936a.m14652e();
        if (resAdEntityM14652e == null || C27039d.m66650j(resAdEntityM14652e.getCountDown()) <= 0) {
            function1.invoke(new Pair(Boolean.FALSE, ""));
            return;
        }
        viewStub.setLayoutResource(R$layout.kucoin_layout_ad);
        viewStub.inflate();
        ViewExtKt.m66594y(viewStub);
        EdgeToEdgeCompat.f48106a.m58267e(baseActivity, ContextCompat.getColor(baseActivity, R$color.c_transparent));
        ImageView imageView = (ImageView) baseActivity.findViewById(R$id.iv_ad);
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        String filePath = resAdEntityM14652e.getFilePath();
        if (filePath != null && filePath.length() > 0) {
            imageView.setImageURI(Uri.fromFile(new File(filePath)));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", resAdEntityM14652e.getTitle());
        jSONObject.put("optionKey", resAdEntityM14652e.getLanguage());
        jSONObject.put("url", resAdEntityM14652e.getUrl());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("BTsplashPage", "startupAds", null, jSONObject, 4, null);
        this.f14941b = (TextView) baseActivity.findViewById(R$id.tv_timer);
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.ad.service.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SplashHockSPI.m14687j(this.f14958b, function1, resAdEntityM14652e);
            }
        }, 1, null);
        TextView textView = this.f14941b;
        if (textView != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.ad.service.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SplashHockSPI.m14688k(this.f14961b, function1, resAdEntityM14652e);
                }
            }, 1, null);
        }
        long jM66650j = C27039d.m66650j(resAdEntityM14652e.getCountDown());
        TextView textView2 = this.f14941b;
        if (textView2 != null) {
            int i11 = R$string.skip_stub;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jM66650j);
            sb2.append('S');
            textView2.setText(baseActivity.getString(i11, sb2.toString()));
        }
        this.f14940a = C41636g.m90891O(C41636g.m90890N(C41636g.m90895S(C41636g.m90897U(C41636g.m90896T(C41636g.m90887K(new SplashHockSPI$checkAd$1$5(jM66650j, this, null)), new SplashHockSPI$checkAd$1$6(this, baseActivity, null)), new SplashHockSPI$checkAd$1$7(this, baseActivity, jM66650j, null)), new SplashHockSPI$checkAd$1$8(this, imageView, function1, baseActivity, resAdEntityM14652e, null)), C42911a.m94121c()), LifecycleOwnerKt.getLifecycleScope(baseActivity));
        C44128b.m97259c("StartupDispatcher", "SplashActivity getAdsByType");
    }

    /* JADX INFO: renamed from: l */
    public final void m14691l(BaseActivity baseActivity) {
        TextView textView = this.f14941b;
        if (textView != null) {
            textView.setText(baseActivity.getString(R$string.asset_loading));
        }
        int dimension = (int) baseActivity.getResources().getDimension(R$dimen.spacing_14);
        CircleLoadingDrawable circleLoadingDrawable = new CircleLoadingDrawable(ContextCompat.getColor(baseActivity, R$color.c_text));
        circleLoadingDrawable.setBounds(0, 0, dimension, dimension);
        TextView textView2 = this.f14941b;
        if (textView2 != null) {
            textView2.setCompoundDrawablesRelative(null, null, circleLoadingDrawable, null);
        }
        circleLoadingDrawable.m55416a();
    }
}
