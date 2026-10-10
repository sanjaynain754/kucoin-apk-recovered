package com.jumio.core.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.commons.utils.ScreenUtilKt;
import com.jumio.core.C9301R;
import jumio.core.InterfaceC40668h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\r\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/views/CheckView;", "I", "Lcom/jumio/core/interfaces/CheckInterface;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerRadius", "getCornerRadius", "()I", "setCornerRadius", "(I)V", ViewProps.BORDER_COLOR, "getBorderColor", "setBorderColor", "init", "", "detach", "detach$jumio_core_release", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CheckView<I extends InterfaceC40668h0> extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public int f14594a;

    /* JADX INFO: renamed from: b */
    public int f14595b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: getBorderColor, reason: from getter */
    public final int getF14595b() {
        return this.f14595b;
    }

    /* JADX INFO: renamed from: getCornerRadius, reason: from getter */
    public final int getF14594a() {
        return this.f14594a;
    }

    public final void setBorderColor(int i11) {
        this.f14595b = i11;
    }

    public final void setCornerRadius(int i11) {
        this.f14594a = i11;
    }

    public /* synthetic */ CheckView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void detach$jumio_core_release() {
        removeAllViews();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14594a = ScreenUtilKt.dpToPx(0, context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C9301R.styleable.CheckView, 0, 0) : null;
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    this.f14594a = typedArrayObtainStyledAttributes.getDimensionPixelSize(C9301R.styleable.CheckView_jumio_cornerRadius, ScreenUtilKt.dpToPx(0, context));
                    this.f14595b = typedArrayObtainStyledAttributes.getColor(C9301R.styleable.CheckView_jumio_imageBorder, 0);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
