package com.revolut.revolutpay.ui_kit.widget.large_action_button;

import ab0.C0228b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.R$styleable;
import com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wa0.C45783d;
import xa0.InterfaceC46115a;
import za0.C46744c;
import za0.C46745d;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 E2\u00020\u0001:\u0003\u000b\u000f&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\bJ\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<¨\u0006F"}, m90084d2 = {"Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "", "styleId", "b", "(I)V", "", "enabled", "setEnabled", "(Z)V", "pressed", "setPressed", "Landroid/view/View$OnClickListener;", "clickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lxa0/a;", "clause", "setText", "(Lxa0/a;)V", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton$c;", "loadingState", "setLoadingState", "(Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton$c;)V", "e", "Lab0/b;", "buttonParams", "c", "(Lab0/b;)V", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton$a;", TtmlNode.TAG_STYLE, "f", "(Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton$a;)V", "Landroid/view/View;", "n", "Landroid/view/View;", "button", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "buttonTextView", "Landroid/widget/ProgressBar;", "p", "Landroid/widget/ProgressBar;", "progressBar", "q", "Z", "enableOnFinishLoadingState", "r", "Landroid/view/View$OnClickListener;", CmcdData.Factory.STREAMING_FORMAT_SS, "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton$c;", "t", "shadowEnabled", "u", "Lab0/b;", "v", "internalClickListener", "w", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class LargeActionButton extends ConstraintLayout {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public View button;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView buttonTextView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean enableOnFinishLoadingState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener clickListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public EnumC27604c loadingState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean shadowEnabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public C0228b buttonParams;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final View.OnClickListener internalClickListener;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton$a */
    public static abstract class AbstractC27602a {

        /* JADX INFO: renamed from: a */
        public final boolean f56423a;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton$a$a */
        public static final class a extends AbstractC27602a {

            /* JADX INFO: renamed from: b */
            @NotNull
            public static final a f56424b = new a();

            public a() {
                super(null);
            }

            @Override // com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton.AbstractC27602a
            @NotNull
            /* JADX INFO: renamed from: d */
            public ColorStateList mo68561d(@NotNull Context context, @NotNull C0228b buttonParams) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(buttonParams, "buttonParams");
                return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[0]}, new int[]{-1, -7829368});
            }

            @Override // com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton.AbstractC27602a
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public StateListDrawable mo68559b(@NotNull Context context, @NotNull C0228b buttonParams) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(buttonParams, "buttonParams");
                return m68560c(ColorUtils.compositeColors(ColorUtils.setAlphaComponent(buttonParams.m832a(), 50), buttonParams.m833b()), buttonParams.m832a(), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(buttonParams.m832a(), 178), buttonParams.m833b()));
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton$a$b */
        public static final class b extends AbstractC27602a {

            /* JADX INFO: renamed from: b */
            @NotNull
            public static final b f56425b = new b();

            public b() {
                super(null);
            }

            @Override // com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton.AbstractC27602a
            @NotNull
            /* JADX INFO: renamed from: d */
            public ColorStateList mo68561d(@NotNull Context context, @NotNull C0228b buttonParams) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(buttonParams, "buttonParams");
                int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]};
                b bVar = f56425b;
                return new ColorStateList(iArr, new int[]{bVar.m68558a(buttonParams.m832a(), 0.3f), bVar.m68558a(buttonParams.m832a(), 0.8f), buttonParams.m832a()});
            }

            @Override // com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton.AbstractC27602a
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public StateListDrawable mo68559b(@NotNull Context context, @NotNull C0228b buttonParams) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(buttonParams, "buttonParams");
                int i11 = C46745d.f104568a.m103000b(buttonParams.m833b()) ? ViewCompat.MEASURED_STATE_MASK : -1;
                b bVar = f56425b;
                return bVar.m68560c(ColorUtils.compositeColors(bVar.m68558a(buttonParams.m832a(), 0.1f), bVar.m68558a(buttonParams.m833b(), 1.0f)), ColorUtils.compositeColors(bVar.m68558a(i11, 0.9f), bVar.m68558a(buttonParams.m832a(), 1.0f)), ColorUtils.compositeColors(bVar.m68558a(buttonParams.m832a(), 0.2f), bVar.m68558a(buttonParams.m833b(), 1.0f)));
            }
        }

        public AbstractC27602a() {
            this.f56423a = true;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public abstract Drawable mo68559b(@NotNull Context context, @NotNull C0228b c0228b);

        @Nullable
        /* JADX INFO: renamed from: d */
        public abstract ColorStateList mo68561d(@NotNull Context context, @NotNull C0228b c0228b);

        public /* synthetic */ AbstractC27602a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ColorInt
        /* JADX INFO: renamed from: a */
        public final int m68558a(int i11, float f11) {
            return ColorUtils.setAlphaComponent(i11, (int) (f11 * 255));
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final StateListDrawable m68560c(int i11, int i12, int i13) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {R.attr.state_enabled};
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i13);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(i12);
            Unit unit = Unit.INSTANCE;
            stateListDrawable.addState(iArr, new RippleDrawable(colorStateListValueOf, shapeDrawable, null));
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
            shapeDrawable2.getPaint().setColor(i11);
            stateListDrawable.addState(new int[0], shapeDrawable2);
            return stateListDrawable;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton$c */
    public enum EnumC27604c {
        LOADING,
        NOT_LOADING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeActionButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.enableOnFinishLoadingState = isEnabled();
        this.loadingState = EnumC27604c.NOT_LOADING;
        this.buttonParams = C0228b.f684e.m836a();
        this.internalClickListener = new View.OnClickListener() { // from class: ab0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LargeActionButton.m68554g(this.f683b, view);
            }
        };
        m68553d(context);
    }

    /* JADX INFO: renamed from: b */
    private final void m68552b(int styleId) {
        m68557f(styleId == 1 ? AbstractC27602a.b.f56425b : AbstractC27602a.a.f56424b);
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton$d */
    public /* synthetic */ class C27605d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56429a;

        static {
            int[] iArr = new int[EnumC27604c.values().length];
            try {
                iArr[EnumC27604c.NOT_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27604c.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56429a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeActionButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.enableOnFinishLoadingState = isEnabled();
        this.loadingState = EnumC27604c.NOT_LOADING;
        this.buttonParams = C0228b.f684e.m836a();
        this.internalClickListener = new View.OnClickListener() { // from class: ab0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LargeActionButton.m68554g(this.f683b, view);
            }
        };
        m68556e(context, attrs);
        m68553d(context);
        m68555c(this.buttonParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX INFO: renamed from: a */
    private final void m68550a() {
        float f11;
        if (!this.shadowEnabled) {
            f11 = 0.0f;
        } else if (isPressed()) {
            f11 = 4.0f;
        } else if (isEnabled()) {
            f11 = 3.0f;
        } else {
            f11 = 0.0f;
        }
        setElevation(f11);
    }

    /* JADX INFO: renamed from: d */
    private final void m68553d(Context context) {
        View.inflate(context, R$layout.internal_revolut_pay_large_action_button_layout, this);
        setClickable(false);
        setFocusable(false);
        View viewFindViewById = findViewById(R$id.internalRevolutPay_large_action_button_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.intern…large_action_button_text)");
        this.buttonTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internalRevolutPay_large_action_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.intern…tPay_large_action_button)");
        this.button = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internalRevolutPay_large_action_button_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.intern…tion_button_progress_bar)");
        this.progressBar = (ProgressBar) viewFindViewById3;
        View view = this.button;
        ProgressBar progressBar = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            view = null;
        }
        view.setOnClickListener(this.internalClickListener);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            progressBar = progressBar2;
        }
        progressBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m68555c(C0228b buttonParams) {
        TextView textView = this.buttonTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            textView = null;
        }
        textView.setText(buttonParams.m835d());
        m68552b(buttonParams.m834c());
    }

    /* JADX INFO: renamed from: f */
    public final void m68557f(AbstractC27602a style) {
        View view = this.button;
        ProgressBar progressBar = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            view = null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        view.setBackground(style.mo68559b(context, this.buttonParams));
        TextView textView = this.buttonTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            textView = null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        textView.setTextColor(style.mo68561d(context2, this.buttonParams));
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            progressBar = progressBar2;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        progressBar.setIndeterminateTintList(style.mo68561d(context3, this.buttonParams));
        m68550a();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.enableOnFinishLoadingState = enabled;
        if (this.loadingState != EnumC27604c.LOADING) {
            super.setEnabled(enabled);
            TextView textView = this.buttonTextView;
            View view = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
                textView = null;
            }
            textView.setEnabled(enabled);
            View view2 = this.button;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("button");
            } else {
                view = view2;
            }
            view.setEnabled(enabled);
            m68550a();
        }
    }

    public final void setLoadingState(@NotNull EnumC27604c loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.loadingState = loadingState;
        int i11 = C27605d.f56429a[loadingState.ordinal()];
        TextView textView = null;
        if (i11 == 1) {
            ProgressBar progressBar = this.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            TextView textView2 = this.buttonTextView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            } else {
                textView = textView2;
            }
            textView.setVisibility(0);
            setEnabled(this.enableOnFinishLoadingState);
            return;
        }
        if (i11 != 2) {
            return;
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar2 = null;
        }
        progressBar2.setVisibility(0);
        TextView textView3 = this.buttonTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        } else {
            textView = textView3;
        }
        textView.setVisibility(4);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public final void setText(@Nullable InterfaceC46115a clause) {
        TextView textView = this.buttonTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            textView = null;
        }
        C45783d.m101109b(textView, clause, null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m68554g(LargeActionButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.clickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68556e(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R$styleable.LargeActionButton, 0, 0);
        boolean z11 = true;
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.LargeActionButton_revolutPay_ComponentCornerRadius, TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
        setOutlineProvider(new C46744c(dimension, true));
        if (dimension <= 0.0f) {
            z11 = false;
        }
        setClipToOutline(z11);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.LargeActionButton_revolutPay_largeActionButtonStyle, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.LargeActionButton_revolutPay_ColorAccent, Color.parseColor("#0666EB"));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.LargeActionButton_revolutPay_ColorBackground, Color.parseColor("#F7F7F7"));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.LargeActionButton_android_text);
        if (string == null) {
            string = "";
        }
        Intrinsics.checkNotNullExpressionValue(string, "it.getString(R.styleable…utton_android_text) ?: \"\"");
        this.buttonParams = new C0228b(i11, color, color2, string);
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        TextView textView = this.buttonTextView;
        View view = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            textView = null;
        }
        textView.setPressed(pressed);
        View view2 = this.button;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
        } else {
            view = view2;
        }
        view.setPressed(pressed);
        m68550a();
    }
}
