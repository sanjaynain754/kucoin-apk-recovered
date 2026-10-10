package com.kubi.assets.overview;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.kubi.resources.guideview.InterfaceC22894b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44818m2;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.p0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DetailComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/overview/DetailComponent;", "Lcom/kubi/resources/guideview/Component;", "tabViewRect", "Landroid/graphics/Rect;", "onClickListener", "Landroid/view/View$OnClickListener;", "<init>", "(Landroid/graphics/Rect;Landroid/view/View$OnClickListener;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewGuideBinding;", "getAnchor", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getYOffset", "getFitPosition", "getXOffset", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DetailComponent implements InterfaceC22894b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Rect f18541a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final View.OnClickListener f18542b;

    /* JADX INFO: renamed from: c */
    public C44818m2 f18543c;

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: a */
    public int mo18889a() {
        return 0;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: c */
    public int mo18891c() {
        return 2;
    }

    public DetailComponent(@NotNull Rect tabViewRect, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(tabViewRect, "tabViewRect");
        this.f18541a = tabViewRect;
        this.f18542b = onClickListener;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: b */
    public int mo18890b() {
        return -C5275i0.m6236a(3.0f);
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: d */
    public int mo18892d() {
        return 32;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    @NotNull
    /* JADX INFO: renamed from: e */
    public View mo18893e(@NotNull LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C44818m2 c44818m2M99159c = C44818m2.m99159c(inflater);
        Intrinsics.checkNotNullExpressionValue(c44818m2M99159c, "inflate(...)");
        this.f18543c = c44818m2M99159c;
        C44818m2 c44818m2 = null;
        if (c44818m2M99159c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c44818m2M99159c = null;
        }
        c44818m2M99159c.f100451d.setOnClickListener(this.f18542b);
        C44818m2 c44818m3 = this.f18543c;
        if (c44818m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c44818m3 = null;
        }
        c44818m3.f100449b.setArrowPosDelta(this.f18541a.width() / 2.0f);
        C44818m2 c44818m4 = this.f18543c;
        if (c44818m4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c44818m2 = c44818m4;
        }
        BubbleLinearLayout root = c44818m2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
