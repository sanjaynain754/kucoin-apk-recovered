package com.kubi.resources;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.AlertTipsTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.resources.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: InjectExpandableUIBehavior.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/resources/InjectExpandableUIBehavior;", "", "tips", "", "textView", "Lcom/kubi/resources/widget/AlertTipsTextView;", "ivArrow", "Landroid/widget/ImageView;", "maxCollapsedLines", "", "iconExpand", "Landroid/graphics/drawable/Drawable;", "iconCollapse", "<init>", "(Ljava/lang/String;Lcom/kubi/resources/widget/AlertTipsTextView;Landroid/widget/ImageView;ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "isExpanded", "", "updateState", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInjectExpandableUIBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjectExpandableUIBehavior.kt\ncom/kubi/resources/InjectExpandableUIBehavior\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n37#2:78\n53#2:79\n37#2:80\n53#2:81\n*S KotlinDebug\n*F\n+ 1 InjectExpandableUIBehavior.kt\ncom/kubi/resources/InjectExpandableUIBehavior\n*L\n30#1:78\n30#1:79\n37#1:80\n37#1:81\n*E\n"})
public final class InjectExpandableUIBehavior {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final AlertTipsTextView f43657a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ImageView f43658b;

    /* JADX INFO: renamed from: c */
    public final int f43659c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Drawable f43660d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Drawable f43661e;

    /* JADX INFO: renamed from: f */
    public boolean f43662f;

    /* JADX INFO: renamed from: com.kubi.resources.n$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 InjectExpandableUIBehavior.kt\ncom/kubi/resources/InjectExpandableUIBehavior\n*L\n1#1,414:1\n37#2:415\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            InjectExpandableUIBehavior.this.m54356e();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.n$b */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 InjectExpandableUIBehavior.kt\ncom/kubi/resources/InjectExpandableUIBehavior\n*L\n1#1,414:1\n30#2:415\n*E\n"})
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            InjectExpandableUIBehavior.this.m54356e();
        }
    }

    public InjectExpandableUIBehavior(@Nullable String str, @Nullable AlertTipsTextView alertTipsTextView, @Nullable ImageView imageView, int i11, @Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this.f43657a = alertTipsTextView;
        this.f43658b = imageView;
        this.f43659c = i11;
        this.f43660d = drawable;
        this.f43661e = drawable2;
        if (!TextUtils.equals(alertTipsTextView != null ? alertTipsTextView.getText() : null, str)) {
            if (alertTipsTextView != null) {
                alertTipsTextView.setText(str);
            }
            if (alertTipsTextView != null) {
                alertTipsTextView.setMaxLines(Integer.MAX_VALUE);
            }
            if (alertTipsTextView != null) {
                alertTipsTextView.addOnLayoutChangeListener(new b());
            }
        }
        if (alertTipsTextView != null) {
            alertTipsTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InjectExpandableUIBehavior.m54353c(this.f43655b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m54353c(InjectExpandableUIBehavior injectExpandableUIBehavior, View view) {
        injectExpandableUIBehavior.f43662f = !injectExpandableUIBehavior.f43662f;
        injectExpandableUIBehavior.f43657a.setMaxLines(Integer.MAX_VALUE);
        injectExpandableUIBehavior.f43657a.addOnLayoutChangeListener(injectExpandableUIBehavior.new a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m54355f(InjectExpandableUIBehavior injectExpandableUIBehavior) {
        injectExpandableUIBehavior.f43657a.requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public final void m54356e() {
        Layout layout;
        if (this.f43657a == null) {
            return;
        }
        if (this.f43657a.getGlobalVisibleRect(new Rect()) && (layout = this.f43657a.getLayout()) != null) {
            if (layout.getLineCount() <= this.f43659c) {
                this.f43657a.setEllipsize(null);
                ImageView imageView = this.f43658b;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                this.f43657a.requestLayout();
                return;
            }
            if (this.f43662f) {
                ImageView imageView2 = this.f43658b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    imageView2.setImageDrawable(this.f43661e);
                }
                this.f43657a.setMaxLines(Integer.MAX_VALUE);
                this.f43657a.setEllipsize(null);
            } else {
                ImageView imageView3 = this.f43658b;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    imageView3.setImageDrawable(this.f43660d);
                }
                this.f43657a.setMaxLines(this.f43659c);
                this.f43657a.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.f43657a.post(new Runnable() { // from class: com.kubi.resources.m
                @Override // java.lang.Runnable
                public final void run() {
                    InjectExpandableUIBehavior.m54355f(this.f43656b);
                }
            });
        }
    }
}
