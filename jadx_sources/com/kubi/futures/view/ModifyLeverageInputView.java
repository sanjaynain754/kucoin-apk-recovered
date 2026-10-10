package com.kubi.futures.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17071w;
import com.kubi.kumex.utils.SimpleTextWatcher;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyLeverageInputView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020#H\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0017J\b\u0010*\u001a\u00020\u001cH\u0002J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0017J\u000e\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020#J\u001a\u00102\u001a\u00020\u001c2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0014\u00103\u001a\u00020\u001c2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0 J\u0014\u00104\u001a\u00020\u001c2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0 J\u001a\u00105\u001a\u00020\u001c2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0\u001bJ \u00106\u001a\u00020\u001c2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0%J\b\u00107\u001a\u0004\u0018\u00010\u0017J\b\u00108\u001a\u0004\u0018\u00010\u0017J\b\u00109\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/futures/view/ModifyLeverageInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tag", "Landroidx/appcompat/widget/AppCompatTextView;", "leftTag", AuthenticationTokenClaims.JSON_KEY_SUB, "Landroidx/appcompat/widget/AppCompatImageView;", "plus", "input", "Landroidx/appcompat/widget/AppCompatEditText;", "circleBg", "Landroid/graphics/drawable/Drawable;", "subPositiveDrawable", "subNegativeDrawable", "plusPositiveDrawable", "plusNegativeDrawable", "minValue", "Ljava/math/BigDecimal;", "maxValue", "value", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "precision", "", "plusListener", "Lkotlin/Function0;", "subListener", "focusChangeListener", "", "limitRangeListener", "Lkotlin/Function2;", "handlePlusOrSub", "isPlus", "setValue", "formatValue", "setPlusOrSubEnabled", "setPrecision", "setMax", "max", "setMin", "min", "setSubAndPlusEnabled", "enabled", "setOnValueChangedListener", "setPlusListener", "setSubListener", "setOnFocusChangeListener", "setLimitRangeListener", "getValue", "getMin", "getMax", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifyLeverageInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    @Nullable
    public Function1<? super BigDecimal, Unit> f25004A;

    /* JADX INFO: renamed from: B */
    public int f25005B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public Function0<Unit> f25006C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public Function0<Unit> f25007D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public Function1<? super Boolean, Unit> f25008E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public Function2<? super BigDecimal, ? super BigDecimal, Unit> f25009F;

    /* JADX INFO: renamed from: n */
    @NotNull
    public AppCompatTextView f25010n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public AppCompatTextView f25011o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final AppCompatImageView f25012p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final AppCompatImageView f25013q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final AppCompatEditText f25014r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Drawable f25015s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Drawable f25016t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Drawable f25017u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Drawable f25018v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Drawable f25019w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public BigDecimal f25020x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public BigDecimal f25021y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public BigDecimal f25022z;

    /* JADX INFO: renamed from: com.kubi.futures.view.ModifyLeverageInputView$a */
    /* JADX INFO: compiled from: ModifyLeverageInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/view/ModifyLeverageInputView$5", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14453a extends SimpleTextWatcher {
        public C14453a() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            super.onTextChanged(s11, start, before, count);
            BigDecimal bigDecimalM36620b = C17071w.m36620b(String.valueOf(s11), null, 1, null);
            ModifyLeverageInputView.this.f25022z = bigDecimalM36620b;
            ModifyLeverageInputView.this.m28871o();
            Function1 function1 = ModifyLeverageInputView.this.f25004A;
            if (function1 != null) {
                function1.invoke(bigDecimalM36620b);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m28862f(ModifyLeverageInputView modifyLeverageInputView, View view) {
        modifyLeverageInputView.m28870n(false);
    }

    /* JADX INFO: renamed from: g */
    public static final void m28863g(ModifyLeverageInputView modifyLeverageInputView, View view) {
        modifyLeverageInputView.m28870n(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyLeverageInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Drawable drawableM36481g;
        Drawable drawableM36481g2;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bkumex_modify_leverage_input_view, this);
        View viewFindViewById = findViewById(R$id.tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f25010n = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.leftTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f25011o = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.sub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById3;
        this.f25012p = appCompatImageView;
        View viewFindViewById4 = findViewById(R$id.plus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById4;
        this.f25013q = appCompatImageView2;
        View viewFindViewById5 = findViewById(R$id.input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        AppCompatEditText appCompatEditText = (AppCompatEditText) viewFindViewById5;
        this.f25014r = appCompatEditText;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$color.c_cover4;
        this.f25015s = C22890g.m54287l(c27017c.m66512a(i11), 12.0f);
        Resources resources = getResources();
        int i12 = R$drawable.ic2_sub_16;
        Drawable drawable = ResourcesCompat.getDrawable(resources, i12, null);
        this.f25016t = (drawable == null || (drawableM36481g2 = ViewExKt.m36481g(drawable, R$color.c_icon)) == null) ? c27017c.m66514c(i12, Integer.valueOf(R$color.c_icon)) : drawableM36481g2;
        Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), i12, null);
        Drawable drawableM66514c = (drawable2 == null || (drawableM66514c = ViewExKt.m36481g(drawable2, R$color.c_icon40)) == null) ? c27017c.m66514c(i12, Integer.valueOf(R$color.c_icon40)) : drawableM66514c;
        this.f25017u = drawableM66514c;
        Resources resources2 = getResources();
        int i13 = R$drawable.ic2_plus_16;
        Drawable drawable3 = ResourcesCompat.getDrawable(resources2, i13, null);
        this.f25018v = (drawable3 == null || (drawableM36481g = ViewExKt.m36481g(drawable3, R$color.c_icon)) == null) ? c27017c.m66514c(i13, Integer.valueOf(R$color.c_icon)) : drawableM36481g;
        Drawable drawable4 = ResourcesCompat.getDrawable(getResources(), i13, null);
        Drawable drawableM66514c2 = (drawable4 == null || (drawableM66514c2 = ViewExKt.m36481g(drawable4, R$color.c_icon40)) == null) ? c27017c.m66514c(i13, Integer.valueOf(R$color.c_icon40)) : drawableM66514c2;
        this.f25019w = drawableM66514c2;
        appCompatImageView.setBackground(C22890g.m54287l(c27017c.m66512a(i11), 12.0f));
        appCompatImageView2.setBackground(C22890g.m54287l(c27017c.m66512a(i11), 12.0f));
        appCompatImageView.setImageDrawable(drawableM66514c);
        appCompatImageView2.setImageDrawable(drawableM66514c2);
        appCompatImageView.setEnabled(false);
        appCompatImageView2.setEnabled(false);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyLeverageInputView.m28862f(this.f25047b, view);
            }
        });
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.view.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyLeverageInputView.m28863g(this.f25048b, view);
            }
        });
        this.f25010n.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.view.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyLeverageInputView.m28864h(this.f25049b, view);
            }
        });
        this.f25011o.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyLeverageInputView.m28865i(this.f25050b, view);
            }
        });
        appCompatEditText.addTextChangedListener(new C14453a());
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.futures.view.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ModifyLeverageInputView.m28866j(this.f25051b, view, z11);
            }
        });
        boolean zM6511a = C5303w0.m6511a();
        C27046k.m66684G(this.f25010n, !zM6511a);
        C27046k.m66684G(this.f25011o, zM6511a);
    }

    /* JADX INFO: renamed from: h */
    public static final void m28864h(ModifyLeverageInputView modifyLeverageInputView, View view) {
        modifyLeverageInputView.f25014r.requestFocus();
        KeyboardUtils.m6041m(modifyLeverageInputView.f25014r);
    }

    /* JADX INFO: renamed from: i */
    public static final void m28865i(ModifyLeverageInputView modifyLeverageInputView, View view) {
        modifyLeverageInputView.f25014r.requestFocus();
        KeyboardUtils.m6041m(modifyLeverageInputView.f25014r);
    }

    /* JADX INFO: renamed from: j */
    public static final void m28866j(ModifyLeverageInputView modifyLeverageInputView, View view, boolean z11) {
        Function1<? super Boolean, Unit> function1 = modifyLeverageInputView.f25008E;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getMax, reason: from getter */
    public final BigDecimal getF25021y() {
        return this.f25021y;
    }

    @Nullable
    /* JADX INFO: renamed from: getMin, reason: from getter */
    public final BigDecimal getF25020x() {
        return this.f25020x;
    }

    @Nullable
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final BigDecimal getF25022z() {
        return this.f25022z;
    }

    /* JADX INFO: renamed from: n */
    public final void m28870n(boolean z11) {
        BigDecimal bigDecimal = this.f25022z;
        if (bigDecimal != null) {
            BigDecimal bigDecimalAdd = z11 ? bigDecimal.add(BigDecimal.ONE) : bigDecimal.subtract(BigDecimal.ONE);
            if (z11 && bigDecimalAdd.compareTo(C27039d.m66656p(this.f25021y)) > 0) {
                bigDecimalAdd = C27039d.m66656p(this.f25021y);
            } else if (!z11 && bigDecimalAdd.compareTo(C27039d.m66656p(this.f25020x)) < 0) {
                bigDecimalAdd = C27039d.m66656p(this.f25020x);
            }
            Intrinsics.checkNotNull(bigDecimalAdd);
            setValue(bigDecimalAdd);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m28871o() {
        BigDecimal bigDecimalM66656p = C27039d.m66656p(this.f25022z);
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(this.f25020x);
        BigDecimal bigDecimalM66656p3 = C27039d.m66656p(this.f25021y);
        if (bigDecimalM66656p.compareTo(bigDecimalM66656p2) <= 0) {
            this.f25012p.setEnabled(false);
            this.f25012p.setImageDrawable(this.f25017u);
            this.f25013q.setEnabled(true);
            this.f25013q.setImageDrawable(this.f25018v);
            return;
        }
        if (bigDecimalM66656p.compareTo(bigDecimalM66656p3) >= 0) {
            this.f25013q.setEnabled(false);
            this.f25013q.setImageDrawable(this.f25019w);
            this.f25012p.setEnabled(true);
            this.f25012p.setImageDrawable(this.f25016t);
            return;
        }
        this.f25012p.setEnabled(true);
        this.f25013q.setEnabled(true);
        this.f25012p.setImageDrawable(this.f25016t);
        this.f25013q.setImageDrawable(this.f25018v);
    }

    public final void setLimitRangeListener(@NotNull Function2<? super BigDecimal, ? super BigDecimal, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25009F = listener;
    }

    public final void setMax(@NotNull BigDecimal max) {
        Intrinsics.checkNotNullParameter(max, "max");
        BigDecimal scale = max.setScale(this.f25005B, RoundingMode.UP);
        if (C27039d.m66656p(this.f25021y).compareTo(scale) == 0) {
            return;
        }
        this.f25021y = scale;
        BigDecimal bigDecimal = this.f25022z;
        if (bigDecimal == null || C27039d.m66656p(bigDecimal).compareTo(max) >= 0) {
            this.f25013q.setImageDrawable(this.f25019w);
            this.f25013q.setEnabled(false);
        } else {
            this.f25013q.setImageDrawable(this.f25018v);
            this.f25013q.setEnabled(true);
        }
    }

    public final void setMin(@NotNull BigDecimal min) {
        Intrinsics.checkNotNullParameter(min, "min");
        BigDecimal scale = min.setScale(this.f25005B, RoundingMode.UP);
        if (C27039d.m66656p(this.f25020x).compareTo(scale) == 0) {
            return;
        }
        this.f25020x = scale;
        BigDecimal bigDecimal = this.f25022z;
        if (bigDecimal == null || C27039d.m66656p(bigDecimal).compareTo(min) <= 0) {
            this.f25012p.setImageDrawable(this.f25017u);
            this.f25012p.setEnabled(false);
        } else {
            this.f25012p.setImageDrawable(this.f25016t);
            this.f25012p.setEnabled(true);
        }
    }

    public final void setOnFocusChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25008E = listener;
    }

    public final void setOnValueChangedListener(@NotNull Function1<? super BigDecimal, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25004A = listener;
    }

    public final void setPlusListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25006C = listener;
    }

    public final void setPrecision(int precision) {
        this.f25005B = precision;
        if (precision <= 0) {
            this.f25014r.setInputType(2);
        } else {
            this.f25014r.setInputType(8194);
        }
        this.f25014r.setFilters(new InputFilter[]{new C27056j0(precision)});
    }

    public final void setSubAndPlusEnabled(boolean enabled) {
        this.f25012p.setEnabled(enabled);
        this.f25013q.setEnabled(enabled);
    }

    public final void setSubListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25007D = listener;
    }

    public final void setValue(@NotNull BigDecimal formatValue) {
        Function2<? super BigDecimal, ? super BigDecimal, Unit> function2;
        Function2<? super BigDecimal, ? super BigDecimal, Unit> function3;
        Intrinsics.checkNotNullParameter(formatValue, "formatValue");
        BigDecimal scale = formatValue.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bigDecimal = this.f25022z;
        if (bigDecimal == null || C27039d.m66656p(bigDecimal).compareTo(scale) != 0) {
            BigDecimal bigDecimal2 = this.f25020x;
            if (bigDecimal2 == null) {
                bigDecimal2 = scale;
            }
            BigDecimal bigDecimal3 = this.f25021y;
            if (bigDecimal3 == null) {
                bigDecimal3 = scale;
            }
            if (scale.compareTo(bigDecimal2) <= 0) {
                if (this.f25022z != null && (function3 = this.f25009F) != null) {
                    Intrinsics.checkNotNull(bigDecimal2);
                    Intrinsics.checkNotNull(bigDecimal3);
                    function3.invoke(bigDecimal2, bigDecimal3);
                }
                scale = bigDecimal2;
            } else if (scale.compareTo(bigDecimal3) >= 0) {
                if (this.f25022z != null && (function2 = this.f25009F) != null) {
                    Intrinsics.checkNotNull(bigDecimal2);
                    Intrinsics.checkNotNull(bigDecimal3);
                    function2.invoke(bigDecimal2, bigDecimal3);
                }
                scale = bigDecimal3;
            }
            this.f25014r.setText(C6447a.m11724a(scale).toPlainString());
            C27046k.m66707v(this.f25014r);
        }
    }
}
