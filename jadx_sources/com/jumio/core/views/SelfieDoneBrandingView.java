package com.jumio.core.views;

import android.annotation.SuppressLint;
import android.content.Context;
import com.jumio.core.C9301R;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/views/SelfieDoneBrandingView;", "Lcom/jumio/core/views/BaseBrandingView;", "context", "Landroid/content/Context;", "tintColorId", "", "<init>", "(Landroid/content/Context;I)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class SelfieDoneBrandingView extends BaseBrandingView {
    public /* synthetic */ SelfieDoneBrandingView(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? C9301R.color.jumio_black : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieDoneBrandingView(@NotNull Context context, int i11) {
        super(context, "jumio_selfie_done_branding_view", C9301R.drawable.jumio_ic_selfie_done, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
