package com.sumsub.sns.core.common;

import android.R;
import android.os.Build;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.sumsub.sns.internal.log.C33272c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\u00020\u0005*\u00020\tH\u0002¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;", "", "<init>", "()V", "applyEdgeToEdge", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "applyEdgeToEdgeApi35Fix", "Landroid/view/View;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSEdgeToEdgeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEdgeToEdgeUtils.kt\ncom/sumsub/sns/core/common/SNSEdgeToEdgeUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n1#2:48\n163#3,2:49\n*S KotlinDebug\n*F\n+ 1 SNSEdgeToEdgeUtils.kt\ncom/sumsub/sns/core/common/SNSEdgeToEdgeUtils\n*L\n36#1:49,2\n*E\n"})
public final class SNSEdgeToEdgeUtils {

    @NotNull
    public static final SNSEdgeToEdgeUtils INSTANCE = new SNSEdgeToEdgeUtils();

    public final void applyEdgeToEdge(@NotNull AppCompatActivity activity) {
        Object objM103844constructorimpl;
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(activity.findViewById(R.id.content));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            INSTANCE.applyEdgeToEdgeApi35Fix((View) objM103844constructorimpl);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c.f67816e.f67810a.mo68956e("SDK", "Failed to apply edge to edge fix to Sumsub activity", thM103847exceptionOrNullimpl);
        }
    }

    private SNSEdgeToEdgeUtils() {
    }

    private final void applyEdgeToEdgeApi35Fix(View view) {
        ViewCompat.setOnApplyWindowInsetsListener(view.getRootView(), new OnApplyWindowInsetsListener() { // from class: com.sumsub.sns.core.common.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return SNSEdgeToEdgeUtils.applyEdgeToEdgeApi35Fix$lambda$3(view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applyEdgeToEdgeApi35Fix$lambda$3(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
