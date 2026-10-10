package com.jumio.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.core.views.CheckView;
import jumio.core.InterfaceC40671h3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioRejectView;", "Lcom/jumio/core/views/CheckView;", "Lcom/jumio/core/interfaces/RejectInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "cornerRadius", ViewProps.BORDER_COLOR, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRejectView extends CheckView<InterfaceC40671h3> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioRejectView(@NotNull Context context) {
        this(context, null, 0, 0, 0, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioRejectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioRejectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 0, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioRejectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, 0, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ JumioRejectView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioRejectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12, int i13) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setCornerRadius(i12);
        setBorderColor(i13);
        setFilterTouchesWhenObscured(true);
    }
}
