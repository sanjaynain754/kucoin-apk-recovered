package com.kubi.assets.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$styleable;
import com.kubi.resources.widget.BaseTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VerticalIconTextBtn.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/view/VerticalIconTextBtn;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ivIcon", "Landroid/widget/ImageView;", "tvLabel", "Lcom/kubi/resources/widget/BaseTextView;", "setIcon", "", "resId", "setLabel", "text", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VerticalIconTextBtn extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ImageView f19110b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BaseTextView f19111c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalIconTextBtn(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalIconTextBtn(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIcon(int resId) {
        this.f19110b.setImageResource(resId);
    }

    public final void setLabel(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f19111c.setText(text);
    }

    public /* synthetic */ VerticalIconTextBtn(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalIconTextBtn(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(17);
        LayoutInflater.from(context).inflate(R$layout.asset_vertical_image_text_btn, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f19110b = imageView;
        View viewFindViewById2 = findViewById(R$id.tvName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        BaseTextView baseTextView = (BaseTextView) viewFindViewById2;
        this.f19111c = baseTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VerticalIconTextBtn);
        imageView.setImageResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VerticalIconTextBtn_iconSrc, 0));
        baseTextView.setText(typedArrayObtainStyledAttributes.getString(R$styleable.VerticalIconTextBtn_labelText));
        typedArrayObtainStyledAttributes.recycle();
    }
}
