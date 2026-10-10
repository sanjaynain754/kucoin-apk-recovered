package k10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Window;
import android.widget.ImageView;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$id;
import com.kubi.sdk.R$layout;
import com.kubi.sdk.adapter.DiffAdapterIssue;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: k10.b */
/* JADX INFO: compiled from: LoadingDialog.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/widget/loading/LoadingDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "needMask", "", "<init>", "(Landroid/content/Context;Z)V", "getNeedMask", "()Z", "loadingCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", TIMPushProvider.f75062n, "dismiss", "isShowing", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCDialogCheck", "KCSynchronizedCheck"})
@SourceDebugExtension({"SMAP\nLoadingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingDialog.kt\ncom/kubi/sdk/widget/loading/LoadingDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 DiffAdapterIssue.kt\ncom/kubi/sdk/adapter/DiffAdapterIssueKt\n*L\n1#1,93:1\n28#2:94\n46#3,2:95\n*S KotlinDebug\n*F\n+ 1 LoadingDialog.kt\ncom/kubi/sdk/widget/loading/LoadingDialog\n*L\n38#1:94\n64#1:95,2\n*E\n"})
public final class DialogC40864b extends Dialog {

    /* JADX INFO: renamed from: b */
    public final boolean f90867b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicInteger f90868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC40864b(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90867b = z11;
        this.f90868c = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m89436a(boolean z11) {
        if (z11) {
            try {
                if (this.f90868c.get() > 0) {
                    this.f90868c.set(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public synchronized void dismiss() {
        if (this.f90868c.get() == 0) {
            return;
        }
        if (this.f90868c.decrementAndGet() == 0) {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog
    public synchronized boolean isShowing() {
        return this.f90868c.get() > 0;
    }

    @Override // android.app.Dialog
    public synchronized void show() {
        try {
            if (this.f90868c.getAndIncrement() == 0) {
                try {
                    Context context = getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity == null) {
                        Context context2 = getContext();
                        ContextThemeWrapper contextThemeWrapper = context2 instanceof ContextThemeWrapper ? (ContextThemeWrapper) context2 : null;
                        Context baseContext = contextThemeWrapper != null ? contextThemeWrapper.getBaseContext() : null;
                        activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                    }
                    if (activity == null) {
                        super.show();
                    } else if (!activity.isFinishing() && !activity.isDestroyed()) {
                        super.show();
                    }
                } catch (Throwable th2) {
                    C43846g.m96568c(new DiffAdapterIssue(th2, "LoadingDialog", false, null, 8, null), null, 2, null);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public /* synthetic */ DialogC40864b(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? true : z11);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.view_loading);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (!this.f90867b) {
                window.getAttributes().dimAmount = 0.0f;
                window.setAttributes(window.getAttributes());
            }
        }
        ImageView imageView = (ImageView) findViewById(R$id.iv_loading);
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66594y(imageView);
        C24277v.m58539d(getContext(), R$drawable.kc_loading, imageView);
    }
}
