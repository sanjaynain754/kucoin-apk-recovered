package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.kubi.payment.third.kyc.view.AKycBaseView;
import io.reactivex.functions.BiConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AKycBaseView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/AKycBaseView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "biConsumer", "Lio/reactivex/functions/BiConsumer;", "", "getBiConsumer", "()Lio/reactivex/functions/BiConsumer;", "setBiConsumer", "(Lio/reactivex/functions/BiConsumer;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "setRefreshStatus", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AKycBaseView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public BiConsumer<String, String> f40238b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f40239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKycBaseView(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40239c = LazyKt.lazy(new Function0() { // from class: lu.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AKycBaseView.m49575b(context);
            }
        });
    }

    @Nullable
    public final BiConsumer<String, String> getBiConsumer() {
        return this.f40238b;
    }

    public final LayoutInflater getInflater() {
        return (LayoutInflater) this.f40239c.getValue();
    }

    public final void setBiConsumer(@Nullable BiConsumer<String, String> biConsumer) {
        this.f40238b = biConsumer;
    }

    public final void setRefreshStatus(@NotNull BiConsumer<String, String> biConsumer) {
        Intrinsics.checkNotNullParameter(biConsumer, "biConsumer");
        this.f40238b = biConsumer;
    }

    /* JADX INFO: renamed from: b */
    public static final LayoutInflater m49575b(Context context) {
        return LayoutInflater.from(context);
    }
}
