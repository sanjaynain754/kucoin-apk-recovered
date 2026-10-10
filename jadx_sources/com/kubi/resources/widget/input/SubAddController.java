package com.kubi.resources.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5301v0;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.ComponentException;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.numeric.financial.widget.KcOrderStyleInputLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradeInputLayoutEditor;
import com.kubi.resources.widget.TradeInputWithPercentLayoutEditor;
import com.kubi.resources.widget.input.SubAddController;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$font;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import h30.C38104b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import m10.C42388b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: SubAddController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\u0018\u00002\u00020\u0001:\u0001jB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u00106\u001a\u000207J\b\u00108\u001a\u000207H\u0002J\u0010\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000207H\u0002J\b\u0010@\u001a\u000207H\u0002J\u001c\u0010A\u001a\u0002072\b\b\u0002\u0010B\u001a\u00020\u00052\b\b\u0002\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020/H\u0002J\u0010\u0010F\u001a\u0002072\b\u0010G\u001a\u0004\u0018\u00010\u0016J\u000e\u0010L\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010M\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010N\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u0010\u0010O\u001a\u0002072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010P\u001a\u0002072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010Q\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010R\u001a\u000207H\u0002J\b\u0010S\u001a\u000207H\u0002J\u0006\u0010T\u001a\u000207J\u000e\u0010U\u001a\u0002072\u0006\u0010B\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020\rJ \u0010W\u001a\u0002072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010X\u001a\u00020\u0005J\u0016\u0010J\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u0005J\u001e\u0010Z\u001a\u00020\u0012*\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\b\b\u0002\u0010[\u001a\u00020\u0005H\u0002J\u0014\u0010\\\u001a\u00020\u0005*\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0002J\b\u0010]\u001a\u00020\u0005H\u0002J\b\u0010^\u001a\u00020\u0005H\u0002J\u000e\u0010_\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u0012J\b\u0010`\u001a\u000207H\u0002J\b\u0010a\u001a\u000207H\u0002J\b\u0010b\u001a\u000207H\u0002J\u000e\u0010c\u001a\u0002072\u0006\u0010G\u001a\u00020\u001eJ\u000e\u0010d\u001a\u0002072\u0006\u0010G\u001a\u00020\u001cJ\u000e\u0010e\u001a\u0002072\u0006\u0010f\u001a\u00020\u0005J\u0010\u0010g\u001a\u0002072\u0006\u0010f\u001a\u00020\u0005H\u0002J\b\u0010h\u001a\u0004\u0018\u00010\u0012J\u000e\u0010i\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 @BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006k"}, m90084d2 = {"Lcom/kubi/resources/widget/input/SubAddController;", "", "inputViewFl", "Landroid/widget/FrameLayout;", "supportPercent", "", "supportTypeSelector", "supportStepSubAdd", "kcOrderStyleInputLayout", "Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;", "<init>", "(Landroid/widget/FrameLayout;ZZZLcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;)V", ViewProps.PADDING_HORIZONTAL, "", "innerFocus", "Landroid/view/View$OnFocusChangeListener;", CmcdData.Factory.STREAM_TYPE_LIVE, "increment", "Ljava/math/BigDecimal;", "precision", "ensureIncrement", "subListener", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "initValue", "lowValue", "highValue", "percent", "percentFormatter", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;", "percentChangeListener", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;", "value", "Lcom/kubi/futures/view/AnimateDrawableEndView;", "typeSelector", "getTypeSelector", "()Lcom/kubi/futures/view/AnimateDrawableEndView;", "percentHintTextView", "Lcom/kubi/resources/widget/BaseTextView;", "percentTextView", "ivTradeSub", "Landroidx/appcompat/widget/AppCompatImageView;", "ivTradeAdd", "addSubItem", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$DefaultAction;", "changeTypeItem", "dynamicallyEnabledTypeSelector", "requestedAction", "Lcom/kubi/resources/widget/input/SubAddController$InputAction;", "subLongTouchListener", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "getSubLongTouchListener", "()Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "addLongTouchListener", "getAddLongTouchListener", "ensureTypeSelectorEnabled", "", "createTypeSelectorIfNeeded", "initStepSubAdd", "context", "Landroid/content/Context;", "initPercentTextView", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "showSubAddOps", "showChangeTypeOps", "refreshInputAction", "hasFocus", "hasText", "requestAction", TUIConstants.TIMPush.NOTIFICATION.ACTION, "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "setLowValue", "setHighValue", "setInitValue", "setInnerFocusChangeListener", "setRealInnerFocusChanged", "setEnsureIncrement", "subInput", "requestF", "addInput", "ensurePrecisions", "getPrecision", "setPrecision", "followStep", "needAnimation", "step", "isDown", "isStepped", "lessThanLowerValue", "reachHighValue", "setPercent", "setPercentByInternal", "hidePercent", "showPercent", "setOnPercentChangeListener", "setOnPercentFormatter", "setStatusEnabled", "enabled", "disableAddSubItem", "getPercent", "setSupportStepSubAdd", "InputAction", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubAddController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubAddController.kt\ncom/kubi/resources/widget/input/SubAddController\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TradeBaseIssues.kt\ncom/kubi/TradeBaseIssuesKt\n*L\n1#1,636:1\n58#2,23:637\n93#2,3:660\n1#3:663\n18#4,2:664\n18#4,2:666\n18#4,2:668\n*S KotlinDebug\n*F\n+ 1 SubAddController.kt\ncom/kubi/resources/widget/input/SubAddController\n*L\n144#1:637,23\n144#1:660,3\n329#1:664,2\n390#1:666,2\n443#1:668,2\n*E\n"})
public final class SubAddController {

    /* JADX INFO: renamed from: A */
    @Nullable
    public InputAction f44873A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final TradeInputLayoutEditor.OnLongTouchListener f44874B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public final TradeInputLayoutEditor.OnLongTouchListener f44875C;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FrameLayout f44876a;

    /* JADX INFO: renamed from: b */
    public final boolean f44877b;

    /* JADX INFO: renamed from: c */
    public boolean f44878c;

    /* JADX INFO: renamed from: d */
    public boolean f44879d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final KcOrderStyleInputLayout f44880e;

    /* JADX INFO: renamed from: f */
    public final int f44881f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public View.OnFocusChangeListener f44882g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public View.OnFocusChangeListener f44883h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public BigDecimal f44884i;

    /* JADX INFO: renamed from: j */
    public int f44885j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public BigDecimal f44886k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public TradeInputLayoutEditor.InterfaceC22960b f44887l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public BigDecimal f44888m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public BigDecimal f44889n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public BigDecimal f44890o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public BigDecimal f44891p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public TradeInputWithPercentLayoutEditor.InterfaceC22965b f44892q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public TradeInputWithPercentLayoutEditor.InterfaceC22964a f44893r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public AnimateDrawableEndView f44894s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public BaseTextView f44895t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public BaseTextView f44896u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public AppCompatImageView f44897v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public AppCompatImageView f44898w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public KCCustomActionTextInputLayout.ActionItem.DefaultAction f44899x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public KCCustomActionTextInputLayout.ActionItem.DefaultAction f44900y;

    /* JADX INFO: renamed from: z */
    public boolean f44901z;

    /* JADX INFO: compiled from: SubAddController.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/widget/input/SubAddController$InputAction;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_SELECTOR", "STEP_SUB_ADD", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum InputAction {
        TYPE_SELECTOR,
        STEP_SUB_ADD;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f44903c = EnumEntriesKt.enumEntries(m55372a());

        @NotNull
        public static EnumEntries<InputAction> getEntries() {
            return f44903c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.input.SubAddController$b */
    /* JADX INFO: compiled from: SubAddController.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/input/SubAddController$addLongTouchListener$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23072b extends TradeInputLayoutEditor.OnLongTouchListener {
        public C23072b() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54852b() {
            SubAddController.this.m55359n();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.input.SubAddController$c */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SubAddController.kt\ncom/kubi/resources/widget/input/SubAddController\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n145#2,22:98\n71#3:120\n77#4:121\n*E\n"})
    public static final class C23073c implements TextWatcher {
        public C23073c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (SubAddController.this.f44891p.compareTo(BigDecimal.ZERO) <= 0 && SubAddController.this.f44876a.isEnabled()) {
                boolean zM55338F = SubAddController.this.m55338F();
                boolean z11 = !zM55338F;
                AppCompatImageView appCompatImageView = SubAddController.this.f44898w;
                if (appCompatImageView != null) {
                    appCompatImageView.setEnabled(z11);
                }
                if (zM55338F) {
                    SubAddController.this.getF44875C().getF44134b().removeMessages(0);
                }
                AppCompatImageView appCompatImageView2 = SubAddController.this.f44897v;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setEnabled((TextUtils.isEmpty(s11) || SubAddController.this.m55337E()) ? false : true);
                }
                AppCompatImageView appCompatImageView3 = SubAddController.this.f44897v;
                if (appCompatImageView3 != null && !appCompatImageView3.isEnabled()) {
                    SubAddController.this.getF44874B().getF44134b().removeMessages(0);
                }
            }
            if (!TextUtils.isEmpty(s11)) {
                SubAddController.this.m55356Y();
            } else if (SubAddController.this.f44901z) {
                SubAddController.m55320H(SubAddController.this, false, false, 1, null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.input.SubAddController$d */
    /* JADX INFO: compiled from: SubAddController.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/input/SubAddController$subLongTouchListener$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23074d extends TradeInputLayoutEditor.OnLongTouchListener {
        public C23074d() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54852b() {
            SubAddController.this.m55358b0();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m55363r() {
        this.f44878c = true;
        this.f44901z = true;
        m55360o();
        m55320H(this, false, false, 3, null);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.input.SubAddController$a */
    /* JADX INFO: compiled from: SubAddController.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C23071a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputAction.values().length];
            try {
                iArr[InputAction.TYPE_SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputAction.STEP_SUB_ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SubAddController(@NotNull FrameLayout inputViewFl, boolean z11, boolean z12, boolean z13, @NotNull KcOrderStyleInputLayout kcOrderStyleInputLayout) {
        Intrinsics.checkNotNullParameter(inputViewFl, "inputViewFl");
        Intrinsics.checkNotNullParameter(kcOrderStyleInputLayout, "kcOrderStyleInputLayout");
        this.f44876a = inputViewFl;
        this.f44877b = z11;
        this.f44878c = z12;
        this.f44879d = z13;
        this.f44880e = kcOrderStyleInputLayout;
        this.f44881f = C27029c.m66601d(inputViewFl, 12);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44884i = ZERO;
        this.f44885j = 8;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44886k = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44888m = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44889n = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44890o = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44891p = ZERO;
        this.f44874B = new C23074d();
        this.f44875C = new C23072b();
        Context context = inputViewFl.getContext();
        if (z11) {
            Intrinsics.checkNotNull(context);
            m55371z(context, kcOrderStyleInputLayout.getF36422b());
        }
        if (this.f44879d) {
            Intrinsics.checkNotNull(context);
            m55335A(context);
        }
        if (this.f44878c) {
            m55360o();
            m55354W();
        } else if (this.f44879d) {
            m55356Y();
        }
        C38104b.m86032d(kcOrderStyleInputLayout.getF36423c(), new Function2() { // from class: yw.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SubAddController.m55325d(this.f104363b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        kcOrderStyleInputLayout.getF36423c().addTextChangedListener(new C23073c());
        AppCompatImageView appCompatImageView = this.f44897v;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled((TextUtils.isEmpty(kcOrderStyleInputLayout.getF36423c().getEditableText()) || m55337E() || !kcOrderStyleInputLayout.getF36423c().isEnabled()) ? false : true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m55320H(SubAddController subAddController, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = subAddController.f44880e.getF36423c().isFocused();
        }
        if ((i11 & 2) != 0) {
            Editable text = subAddController.f44880e.getF36423c().getText();
            z12 = !(text == null || text.length() == 0);
        }
        subAddController.m55339G(z11, z12);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ BigDecimal m55322a0(SubAddController subAddController, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return subAddController.m55357Z(bigDecimal, bigDecimal2, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m55325d(SubAddController subAddController, View view, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        if (z11 && (baseTextView = subAddController.f44896u) != null && C27046k.m66704s(baseTextView)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            subAddController.m55347P(ZERO);
        }
        subAddController.m55362q(z11);
        m55320H(subAddController, z11, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m55336D(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        return bigDecimal2.compareTo(bigDecimal3) == 0 || bigDecimal.remainder(bigDecimal2).compareTo(bigDecimal3) == 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m55337E() {
        return this.f44889n.compareTo(BigDecimal.ZERO) != 0 && m55369x().compareTo(this.f44889n) <= 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m55338F() {
        return this.f44890o.compareTo(BigDecimal.ZERO) != 0 && m55369x().compareTo(this.f44890o) >= 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m55339G(boolean z11, boolean z12) {
        if (!this.f44878c || z11 || z12) {
            m55356Y();
        } else {
            m55354W();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m55340I(InputAction inputAction) {
        if (this.f44873A == inputAction) {
            return;
        }
        this.f44873A = inputAction;
        int i11 = C23071a.$EnumSwitchMapping$0[inputAction.ordinal()];
        if (i11 == 1) {
            KCCustomActionTextInputLayout.ActionItem.DefaultAction c23070a = this.f44899x;
            if (c23070a != null) {
                this.f44880e.m43245g(c23070a);
            }
            KCCustomActionTextInputLayout.ActionItem.DefaultAction c23070a2 = this.f44900y;
            if (c23070a2 != null) {
                this.f44880e.m43243d(c23070a2);
                return;
            }
            return;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        KCCustomActionTextInputLayout.ActionItem.DefaultAction c23070a3 = this.f44900y;
        if (c23070a3 != null) {
            this.f44880e.m43245g(c23070a3);
        }
        KCCustomActionTextInputLayout.ActionItem.DefaultAction c23070a4 = this.f44899x;
        if (c23070a4 != null) {
            this.f44880e.m43243d(c23070a4);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m55341J() {
        FinancialInputEditText f36423c = this.f44880e.getF36423c();
        f36423c.setFocusable(true);
        f36423c.setFocusableInTouchMode(true);
        f36423c.requestFocus();
    }

    /* JADX INFO: renamed from: K */
    public final void m55342K(@NotNull BigDecimal ensureIncrement) {
        Intrinsics.checkNotNullParameter(ensureIncrement, "ensureIncrement");
        this.f44886k = ensureIncrement;
    }

    /* JADX INFO: renamed from: L */
    public final void m55343L(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44890o = value;
    }

    /* JADX INFO: renamed from: M */
    public final void m55344M(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44888m = value;
    }

    /* JADX INFO: renamed from: N */
    public final void m55345N(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44889n = value;
    }

    /* JADX INFO: renamed from: O */
    public final void m55346O(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22965b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44892q = listener;
    }

    /* JADX INFO: renamed from: P */
    public final void m55347P(@NotNull BigDecimal percent) {
        Intrinsics.checkNotNullParameter(percent, "percent");
        if (this.f44891p.compareTo(percent) == 0) {
            return;
        }
        this.f44891p = percent;
        m55348Q();
    }

    /* JADX INFO: renamed from: Q */
    public final void m55348Q() {
        if (this.f44891p.compareTo(BigDecimal.ZERO) <= 0) {
            m55354W();
            m55370y();
            this.f44880e.getF36422b().setAlpha(1.0f);
            this.f44880e.getF36423c().setText("");
            this.f44874B.getF44134b().removeMessages(0);
        } else {
            m55356Y();
            this.f44880e.getF36423c().setText("");
            this.f44880e.getF36422b().setAlpha(0.0f);
            m55355X();
            AppCompatImageView appCompatImageView = this.f44897v;
            if (appCompatImageView != null) {
                appCompatImageView.setEnabled(true);
            }
            boolean z11 = this.f44891p.compareTo(BigDecimal.ONE) < 0;
            AppCompatImageView appCompatImageView2 = this.f44898w;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setEnabled(z11);
            }
            if (!z11) {
                this.f44875C.getF44134b().removeMessages(0);
            }
        }
        TradeInputWithPercentLayoutEditor.InterfaceC22964a interfaceC22964a = this.f44893r;
        if (interfaceC22964a != null) {
            interfaceC22964a.m54896a(this.f44891p);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m55349R(@NotNull BigDecimal increment, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(increment, "increment");
        this.f44885j = i11;
        this.f44884i = increment;
        if (z11) {
            m55342K(increment);
        }
        if (i11 <= 0) {
            this.f44880e.getF36423c().setInputType(2);
        } else {
            this.f44880e.getF36423c().setInputType(8194);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m55350S(boolean z11) {
        this.f44880e.getF36423c().setEnabled(z11);
        m55361p(z11);
    }

    /* JADX INFO: renamed from: T */
    public final void m55351T(boolean z11) {
        if (z11) {
            Context context = this.f44876a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m55335A(context);
        } else {
            this.f44879d = false;
            KCCustomActionTextInputLayout.ActionItem.DefaultAction c23070a = this.f44899x;
            if (c23070a != null) {
                this.f44880e.m43245g(c23070a);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m55352U(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m55353V(value, false);
    }

    /* JADX INFO: renamed from: V */
    public final void m55353V(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        FinancialInputEditText f36423c = this.f44880e.getF36423c();
        BigDecimal scale = m55322a0(this, value, this.f44886k, false, 2, null).setScale(this.f44885j, RoundingMode.DOWN);
        if (scale.compareTo(BigDecimal.ZERO) == 0) {
            f36423c.setText("");
            return;
        }
        String plainString = C6447a.m11724a(scale).toPlainString();
        if (Intrinsics.areEqual(plainString, f36423c.getText() != null ? f36423c.getRawInput() : "")) {
            return;
        }
        f36423c.setBigDecimalValue(plainString);
        Editable text = f36423c.getText();
        f36423c.setSelection(C27039d.m66650j(text != null ? Integer.valueOf(text.length()) : null));
        if (!z11 || this.f44876a.getParent() == null) {
            return;
        }
        C5301v0.m6505b(40L);
    }

    /* JADX INFO: renamed from: W */
    public final void m55354W() {
        m55340I(InputAction.TYPE_SELECTOR);
    }

    /* JADX INFO: renamed from: X */
    public final void m55355X() {
        String strM54897a;
        BaseTextView baseTextView = this.f44896u;
        if (baseTextView != null) {
            C27046k.m66685H(baseTextView);
        }
        BaseTextView baseTextView2 = this.f44895t;
        if (baseTextView2 != null) {
            C27046k.m66685H(baseTextView2);
        }
        BaseTextView baseTextView3 = this.f44896u;
        if (baseTextView3 != null) {
            TradeInputWithPercentLayoutEditor.InterfaceC22965b interfaceC22965b = this.f44892q;
            if (interfaceC22965b == null || (strM54897a = interfaceC22965b.m54897a(this.f44891p)) == null) {
                strM54897a = "";
            }
            baseTextView3.setText(strM54897a);
        }
        BaseTextView baseTextView4 = this.f44895t;
        if (baseTextView4 != null) {
            baseTextView4.setText(this.f44880e.getF36423c().getHint());
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m55356Y() {
        m55340I(InputAction.STEP_SUB_ADD);
    }

    /* JADX INFO: renamed from: Z */
    public final BigDecimal m55357Z(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11) {
        if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0 || m55336D(bigDecimal, bigDecimal2)) {
            return bigDecimal;
        }
        if (z11) {
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal.remainder(bigDecimal2));
            Intrinsics.checkNotNull(bigDecimalSubtract);
            return bigDecimalSubtract;
        }
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2.subtract(bigDecimal.remainder(bigDecimal2)));
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m55358b0() {
        BigDecimal bigDecimalSubtract;
        TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b = this.f44887l;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(true);
        }
        BaseTextView baseTextView = this.f44896u;
        if (baseTextView != null && C27046k.m66704s(baseTextView)) {
            BigDecimal bigDecimalSubtract2 = this.f44891p.subtract(new BigDecimal("0.01"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            this.f44891p = bigDecimalSubtract2;
            m55348Q();
            return;
        }
        BigDecimal bigDecimalM55369x = m55369x();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM55369x.compareTo(bigDecimal) == 0) {
            return;
        }
        try {
            if (this.f44889n.compareTo(bigDecimal) == 0 || bigDecimalM55369x.compareTo(this.f44889n) > 0) {
                bigDecimalSubtract = bigDecimalM55369x.subtract(this.f44884i);
                Intrinsics.checkNotNull(bigDecimalSubtract);
            } else {
                bigDecimalSubtract = this.f44889n;
            }
            Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimal, bigDecimalSubtract);
            Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
            m55352U((BigDecimal) comparableCoerceAtLeast);
            m55341J();
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "KcTradeNumAbInputView", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m55359n() {
        BigDecimal bigDecimalAdd;
        BaseTextView baseTextView = this.f44896u;
        if (baseTextView != null ? C27046k.m66704s(baseTextView) : false) {
            if (this.f44891p.compareTo(BigDecimal.ONE) == 0) {
                return;
            }
            BigDecimal bigDecimalAdd2 = this.f44891p.add(new BigDecimal("0.01"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
            this.f44891p = bigDecimalAdd2;
            m55348Q();
            return;
        }
        BigDecimal bigDecimalM55369x = m55369x();
        BigDecimal bigDecimal = this.f44888m;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0 || bigDecimalM55369x.compareTo(bigDecimal2) != 0 || this.f44888m.compareTo(this.f44884i) <= 0) {
            bigDecimalAdd = bigDecimalM55369x.add(this.f44884i);
            Intrinsics.checkNotNull(bigDecimalAdd);
        } else {
            bigDecimalAdd = this.f44888m;
        }
        if (this.f44890o.compareTo(bigDecimal2) != 0 && bigDecimalAdd.compareTo(this.f44890o) >= 0) {
            bigDecimalAdd = this.f44890o;
        }
        m55352U(bigDecimalAdd);
        m55341J();
        TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b = this.f44887l;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m55360o() {
        if (this.f44894s != null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f44876a.getContext()).inflate(R$layout.btradebase_view_trade_input_layout_change_type, (ViewGroup) null);
        this.f44894s = (AnimateDrawableEndView) viewInflate.findViewById(R$id.changeTypeAnimEndView);
        Intrinsics.checkNotNull(viewInflate);
        this.f44900y = new KCCustomActionTextInputLayout.ActionItem.DefaultAction(viewInflate);
    }

    /* JADX INFO: renamed from: p */
    public final void m55361p(boolean z11) {
        AppCompatImageView appCompatImageView = this.f44898w;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(z11);
        }
        AppCompatImageView appCompatImageView2 = this.f44897v;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m55362q(boolean z11) {
        this.f44876a.setSelected(z11);
        View.OnFocusChangeListener onFocusChangeListener = this.f44883h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this.f44880e.getF36423c(), z11);
        }
        BigDecimal bigDecimal = this.f44886k;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0 || z11) {
            return;
        }
        try {
            if (m55369x().compareTo(bigDecimal2) != 0) {
                m55353V(m55369x(), false);
            }
        } catch (Exception e11) {
            C43846g.m96568c(new ComponentException(e11, "KcTradeNumAbInputView", false, null, 8, null), null, 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final TradeInputLayoutEditor.OnLongTouchListener getF44875C() {
        return this.f44875C;
    }

    public final void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11) {
        this.f44883h = l11;
    }

    public final void setOnPercentChangeListener(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22964a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44893r = listener;
    }

    public final void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11) {
        this.f44882g = l11;
    }

    public final void setSubOrAddClickListener(@Nullable TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b) {
        this.f44887l = interfaceC22960b;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final BigDecimal getF44891p() {
        return this.f44891p;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getF44885j() {
        return this.f44885j;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final TradeInputLayoutEditor.OnLongTouchListener getF44874B() {
        return this.f44874B;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final AnimateDrawableEndView getF44894s() {
        return this.f44894s;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final BigDecimal m55369x() {
        if (!this.f44876a.isEnabled()) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        String rawInput = this.f44880e.getF36423c().getRawInput();
        C44128b.m97265i("combineLatestPriceAndAmount -> SubAddController getValue -> " + rawInput);
        if (TextUtils.isEmpty(rawInput)) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        try {
            return new BigDecimal(rawInput);
        } catch (Exception e11) {
            C43846g.m96568c(new ComponentException(e11, "KcTradeNumAbInputView", false, null, 8, null), null, 2, null);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal2);
            return bigDecimal2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m55370y() {
        BaseTextView baseTextView = this.f44896u;
        if (baseTextView != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        BaseTextView baseTextView2 = this.f44895t;
        if (baseTextView2 != null) {
            ViewExtKt.m66577h(baseTextView2);
        }
        BaseTextView baseTextView3 = this.f44896u;
        if (baseTextView3 != null) {
            baseTextView3.setText("");
        }
        BaseTextView baseTextView4 = this.f44895t;
        if (baseTextView4 != null) {
            baseTextView4.setText("");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m55371z(Context context, TextInputLayout textInputLayout) {
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setVisibility(8);
        baseTextView.setSingleLine();
        baseTextView.setGravity(8388691);
        baseTextView.setTextColor(ContextCompat.getColor(context, R$color.c_text));
        baseTextView.setTextSize(14.0f);
        int i11 = this.f44881f;
        baseTextView.setPaddingRelative(i11, 0, i11, textInputLayout.getPaddingBottom() + C27040e.m66658b(4));
        baseTextView.setBackgroundDrawable(new C42388b().m93043x(textInputLayout.getBoxStrokeWidth()).m93041v(textInputLayout.getBoxStrokeColor()).m93033n(textInputLayout.getBoxCornerRadiusTopStart(), textInputLayout.getBoxCornerRadiusTopEnd(), textInputLayout.getBoxCornerRadiusBottomStart(), textInputLayout.getBoxCornerRadiusBottomEnd()));
        this.f44896u = baseTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f44876a.addView(this.f44896u, layoutParams);
        BaseTextView baseTextView2 = new BaseTextView(context);
        baseTextView2.setVisibility(8);
        baseTextView2.setSingleLine();
        baseTextView2.setGravity(8388659);
        baseTextView2.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        baseTextView2.setTextColor(ContextCompat.getColor(context, R$color.c_text40));
        baseTextView2.setTextSize(10.0f);
        baseTextView2.setPaddingRelative(this.f44881f, textInputLayout.getBoxCollapsedPaddingTop(), this.f44881f, 0);
        baseTextView2.setBackgroundDrawable(new C42388b().m93043x(textInputLayout.getBoxStrokeWidth()).m93041v(textInputLayout.getBoxStrokeColor()).m93033n(textInputLayout.getBoxCornerRadiusTopStart(), textInputLayout.getBoxCornerRadiusTopEnd(), textInputLayout.getBoxCornerRadiusBottomStart(), textInputLayout.getBoxCornerRadiusBottomEnd()));
        this.f44895t = baseTextView2;
        this.f44876a.addView(baseTextView2, new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m55318B(SubAddController subAddController) {
        subAddController.m55358b0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m55319C(SubAddController subAddController) {
        subAddController.m55359n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m55335A(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_trade_input_layout_sub_add, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        this.f44899x = new KCCustomActionTextInputLayout.ActionItem.DefaultAction(viewInflate);
        this.f44897v = (AppCompatImageView) viewInflate.findViewById(R$id.iv_trade_sub);
        this.f44898w = (AppCompatImageView) viewInflate.findViewById(R$id.iv_trade_add);
        AppCompatImageView appCompatImageView = this.f44897v;
        if (appCompatImageView != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: yw.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubAddController.m55318B(this.f104361b);
                }
            }, 1, null);
        }
        AppCompatImageView appCompatImageView2 = this.f44897v;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnTouchListener(this.f44874B);
        }
        AppCompatImageView appCompatImageView3 = this.f44898w;
        if (appCompatImageView3 != null) {
            C27046k.m66711z(appCompatImageView3, 0L, new Function0() { // from class: yw.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubAddController.m55319C(this.f104362b);
                }
            }, 1, null);
        }
        AppCompatImageView appCompatImageView4 = this.f44898w;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setOnTouchListener(this.f44875C);
        }
    }
}
