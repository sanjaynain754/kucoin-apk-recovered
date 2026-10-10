package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5301v0;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import m10.C42388b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43846g;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004~\u007f\u0080\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\u001bH\u0002J\u0006\u0010>\u001a\u00020\u0014J\u0010\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0010\u0010A\u001a\u00020<2\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0006\u0010B\u001a\u00020\u0014J\u0006\u0010C\u001a\u00020DJ\u0012\u0010E\u001a\u00020<2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\u001bH\u0016J\u0006\u0010H\u001a\u00020<J\u0012\u0010I\u001a\u00020<2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\u001bJ\u000e\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020\u001bJ\u0006\u0010N\u001a\u00020<J\u0010\u0010O\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J \u0010P\u001a\u00020<2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001bH\u0016J\b\u0010R\u001a\u00020\bH\u0016J\u0012\u0010S\u001a\u00020<2\b\u0010T\u001a\u0004\u0018\u00010!H\u0016J\b\u0010U\u001a\u00020<H\u0002J\u0010\u0010Z\u001a\u00020<2\u0006\u0010[\u001a\u00020\u001bH\u0016J\u0018\u0010X\u001a\u00020<2\u0006\u0010@\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u001bH\u0016J\u0012\u0010]\u001a\u00020<2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\n\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0010\u0010b\u001a\u00020<2\u0006\u0010c\u001a\u00020\u001bH\u0016J\b\u0010d\u001a\u00020<H\u0002J\b\u0010e\u001a\u00020\u0014H\u0016J\u0010\u0010f\u001a\u00020<2\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010T\u001a\u00020'H\u0016J\u0010\u0010h\u001a\u00020<2\u0006\u0010T\u001a\u00020%H\u0016J\u0010\u0010i\u001a\u00020<2\u0006\u0010j\u001a\u00020\u001bH\u0016J,\u0010k\u001a\u00020<2\b\u0010l\u001a\u0004\u0018\u00010\f2\u0006\u0010m\u001a\u00020a2\b\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010p\u001a\u00020qH\u0016J\u001c\u0010r\u001a\u00020<2\b\u0010s\u001a\u0004\u0018\u00010_2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\u001e\u0010{\u001a\u00020\u0014*\u00020\u00142\u0006\u0010{\u001a\u00020\u00142\b\b\u0002\u0010|\u001a\u00020\u001bH\u0002J\u0014\u0010}\u001a\u00020\u001b*\u00020\u00142\u0006\u0010{\u001a\u00020\u0014H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010@\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006\u0081\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor;", "Landroid/widget/LinearLayout;", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderView", "Landroid/view/View;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "ivTradeSub", "ivTradeAdd", "percentTextView", "Lcom/kubi/resources/widget/BaseTextView;", "increment", "Ljava/math/BigDecimal;", "precision", "ensureIncrement", "appliedPrecision", "Ljava/lang/Integer;", "appliedIncrement", "appliedSupportFloatFilter", "", "Ljava/lang/Boolean;", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnFocusChangeListener;", "innerFocus", "subListener", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "isSupportFloatInputFilter", "percent", "percentFormatter", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;", "percentChangeListener", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;", "isOperatorShow", ViewProps.PADDING_HORIZONTAL, "subLongTouchListener", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener;", "addLongTouchListener", "mUseAddInput", "getMUseAddInput", "()Z", "setMUseAddInput", "(Z)V", "mUseSubInput", "getMUseSubInput", "setMUseSubInput", "initValue", "lowValue", "endView", "tileHeight", "textInputEndIcon", "textInputEndIconInitialPaddingStart", "initPercentTextView", "", "lessThanLowerValue", "getLowValue", "setLowValue", "value", "setInitValue", "getInitValue", "getTitleHintTextSize", "", "setInnerFocusChangeListener", "ensurePrecisions", "hasFocus", "subInput", "setRealInnerFocusChanged", "setUseAddInput", "useAddInput", "setUseSubInput", "useSubInput", "addInput", "setEnsureIncrement", "setPrecision", "followStep", "getPrecision", "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "requestF", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "setSupportStepSubAdd", "isSupportStepSubAdd", "needAnimation", "setHint", "hint", "", "getInputNumberStr", "", "setSupportFloatInputFilter", "support", "setPercentByInternal", "getPercent", "setPercent", "setOnPercentChangeListener", "setOnPercentFormatter", "setStatusEnabled", "enabled", "showTipsAutoDismiss", "anchor", "tips", "defaultTipsView", "Landroid/widget/TextView;", TypedValues.TransitionType.S_DURATION, "", "setTipsContent", "content", "ctx", "getCtx", "()Landroid/content/Context;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "step", "isDown", "isStepped", "OnLongTouchListener", "OnPercentFormatter", "OnPercentChangeListener", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult", "InflateParams"})
@SourceDebugExtension({"SMAP\nTradeInputWithPercentLayoutEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeInputWithPercentLayoutEditor.kt\ncom/kubi/resources/widget/TradeInputWithPercentLayoutEditor\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,708:1\n326#2,4:709\n326#2,4:721\n326#2,4:725\n310#2:729\n326#2,4:730\n311#2:734\n44#3,2:713\n44#3,2:715\n44#3,2:717\n44#3,2:719\n*S KotlinDebug\n*F\n+ 1 TradeInputWithPercentLayoutEditor.kt\ncom/kubi/resources/widget/TradeInputWithPercentLayoutEditor\n*L\n222#1:709,4\n469#1:721,4\n480#1:725,4\n173#1:729\n173#1:730,4\n173#1:734\n282#1:713,2\n306#1:715,2\n334#1:717,2\n451#1:719,2\n*E\n"})
public final class TradeInputWithPercentLayoutEditor extends LinearLayout implements ITradeInputLayoutOperations {

    /* JADX INFO: renamed from: A */
    @NotNull
    public BigDecimal f44143A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public View f44144B;

    /* JADX INFO: renamed from: C */
    public int f44145C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public View f44146D;

    /* JADX INFO: renamed from: E */
    public int f44147E;

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f44148b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public TextInputLayout f44149c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public View f44150d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public View f44151e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseTextView f44152f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public BigDecimal f44153g;

    /* JADX INFO: renamed from: h */
    public int f44154h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public BigDecimal f44155i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Integer f44156j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public BigDecimal f44157k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Boolean f44158l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public View.OnFocusChangeListener f44159m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public View.OnFocusChangeListener f44160n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public TradeInputLayoutEditor.InterfaceC22960b f44161o;

    /* JADX INFO: renamed from: p */
    public boolean f44162p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public BigDecimal f44163q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC22965b f44164r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC22964a f44165s;

    /* JADX INFO: renamed from: t */
    public boolean f44166t;

    /* JADX INFO: renamed from: u */
    public final int f44167u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final OnLongTouchListener f44168v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final OnLongTouchListener f44169w;

    /* JADX INFO: renamed from: x */
    public boolean f44170x;

    /* JADX INFO: renamed from: y */
    public boolean f44171y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public BigDecimal f44172z;

    /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "performLongTouch", "", "onLongTouch", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class OnLongTouchListener implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final Companion f44173c = new Companion(null);

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Handler f44174b = new HandlerC22963a();

        /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener$Companion;", "", "<init>", "()V", "MSG_LONG_TOUCH", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputWithPercentLayoutEditor$OnLongTouchListener$a */
        /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SuppressLint({"HandlerLeak"})
        public static final class HandlerC22963a extends Handler {
            public HandlerC22963a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 0) {
                    OnLongTouchListener.this.m54895c();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo54894b();

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Handler getF44174b() {
            return this.f44174b;
        }

        /* JADX INFO: renamed from: c */
        public final void m54895c() {
            this.f44174b.sendEmptyMessageDelayed(0, ViewConfiguration.getTapTimeout());
            mo54894b();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View v11, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 0) {
                this.f44174b.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
            }
            if (event.getAction() == 3 || event.getAction() == 1) {
                this.f44174b.removeMessages(0);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputWithPercentLayoutEditor$a */
    /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;", "", "onPercentChange", "", "percent", "Ljava/math/BigDecimal;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22964a {
        /* JADX INFO: renamed from: a */
        void m54896a(@NotNull BigDecimal bigDecimal);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputWithPercentLayoutEditor$b */
    /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "percent", "Ljava/math/BigDecimal;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22965b {
        @NotNull
        /* JADX INFO: renamed from: a */
        String m54897a(@NotNull BigDecimal bigDecimal);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputWithPercentLayoutEditor$c */
    /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/TradeInputWithPercentLayoutEditor$addLongTouchListener$1", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22966c extends OnLongTouchListener {
        public C22966c() {
        }

        @Override // com.kubi.resources.widget.TradeInputWithPercentLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54894b() {
            if (TradeInputWithPercentLayoutEditor.this.getF44170x()) {
                TradeInputWithPercentLayoutEditor.this.m54889E();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputWithPercentLayoutEditor$d */
    /* JADX INFO: compiled from: TradeInputWithPercentLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/TradeInputWithPercentLayoutEditor$subLongTouchListener$1", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22967d extends OnLongTouchListener {
        public C22967d() {
        }

        @Override // com.kubi.resources.widget.TradeInputWithPercentLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54894b() {
            if (TradeInputWithPercentLayoutEditor.this.getF44171y()) {
                TradeInputWithPercentLayoutEditor.this.m54892M();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputWithPercentLayoutEditor(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: f */
    public void mo54629f(@NotNull BigDecimal increment, int i11, boolean z11) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(increment, "increment");
        this.f44154h = i11;
        this.f44153g = increment;
        if (z11) {
            setEnsureIncrement(increment);
        }
        Integer num = this.f44156j;
        if (num != null && num.intValue() == i11 && Intrinsics.areEqual(this.f44158l, Boolean.valueOf(this.f44162p)) && (bigDecimal = this.f44157k) != null && bigDecimal.compareTo(increment) == 0) {
            return;
        }
        if (i11 <= 0) {
            getEditText().setInputType(2);
        } else {
            getEditText().setInputType(8194);
        }
        if (this.f44162p) {
            getEditText().setFilters(new InputFilter[]{new C27056j0(i11), new FloatInputFilter()});
        } else {
            getEditText().setFilters(new InputFilter[]{new C27056j0(i11)});
        }
        this.f44156j = Integer.valueOf(i11);
        this.f44157k = increment;
        this.f44158l = Boolean.valueOf(this.f44162p);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputWithPercentLayoutEditor(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public static final void m54862A(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, View view, boolean z11) {
        BaseTextView baseTextView;
        if (z11 && (baseTextView = tradeInputWithPercentLayoutEditor.f44152f) != null && C27046k.m66704s(baseTextView)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            tradeInputWithPercentLayoutEditor.setPercent(ZERO);
        }
        View.OnFocusChangeListener onFocusChangeListener = tradeInputWithPercentLayoutEditor.f44160n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(tradeInputWithPercentLayoutEditor.getEditText(), z11);
        }
        tradeInputWithPercentLayoutEditor.mo54630g(z11);
    }

    /* JADX INFO: renamed from: B */
    public static final void m54863B(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, View view) {
        if (tradeInputWithPercentLayoutEditor.f44171y) {
            tradeInputWithPercentLayoutEditor.m54892M();
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m54864C(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, View view) {
        if (tradeInputWithPercentLayoutEditor.f44170x) {
            tradeInputWithPercentLayoutEditor.m54889E();
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m54865D(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return tradeInputWithPercentLayoutEditor.f44163q.compareTo(BigDecimal.ZERO) <= 0;
    }

    /* JADX INFO: renamed from: G */
    private final boolean m54866G(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        return bigDecimal2.compareTo(bigDecimal3) == 0 || bigDecimal.remainder(bigDecimal2).compareTo(bigDecimal3) == 0;
    }

    /* JADX INFO: renamed from: H */
    private final boolean m54867H() {
        return this.f44143A.compareTo(BigDecimal.ZERO) != 0 && getValue().compareTo(this.f44143A) <= 0;
    }

    /* JADX INFO: renamed from: K */
    private final BigDecimal m54869K(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11) {
        if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0 || m54866G(bigDecimal, bigDecimal2)) {
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

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ BigDecimal m54870L(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return tradeInputWithPercentLayoutEditor.m54869K(bigDecimal, bigDecimal2, z11);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m54882t(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m54883u(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, CharSequence charSequence) {
        tradeInputWithPercentLayoutEditor.f44151e.setEnabled(tradeInputWithPercentLayoutEditor.getEditText().isEnabled());
        tradeInputWithPercentLayoutEditor.f44150d.setEnabled((TextUtils.isEmpty(charSequence) || tradeInputWithPercentLayoutEditor.m54867H() || !tradeInputWithPercentLayoutEditor.getEditText().isEnabled()) ? false : true);
        if (!tradeInputWithPercentLayoutEditor.f44150d.isEnabled()) {
            tradeInputWithPercentLayoutEditor.f44168v.getF44174b().removeMessages(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m54885w(Throwable obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        C44128b.m97264h(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m54888z(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, float f11) {
        View view = tradeInputWithPercentLayoutEditor.f44148b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin - (f11 / 2));
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m54889E() {
        BigDecimal bigDecimalAdd;
        BaseTextView baseTextView = this.f44152f;
        if (baseTextView != null && C27046k.m66704s(baseTextView)) {
            if (this.f44163q.compareTo(BigDecimal.ONE) == 0) {
                return;
            }
            BigDecimal bigDecimalAdd2 = this.f44163q.add(new BigDecimal("0.01"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
            this.f44163q = bigDecimalAdd2;
            m54891J();
            return;
        }
        BigDecimal value = getValue();
        BigDecimal bigDecimal = this.f44172z;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0 || value.compareTo(bigDecimal2) != 0 || this.f44172z.compareTo(this.f44153g) <= 0) {
            bigDecimalAdd = value.add(this.f44153g);
            Intrinsics.checkNotNull(bigDecimalAdd);
        } else {
            bigDecimalAdd = this.f44172z;
        }
        setValue(bigDecimalAdd);
        m54868I();
        TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b = this.f44161o;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(false);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m54890F() {
        BaseTextView baseTextView = this.f44152f;
        if (baseTextView != null) {
            ViewGroup.LayoutParams layoutParams = baseTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            setMinimumWidth(this.f44166t ? getMinimumWidth() : 0);
            baseTextView.setLayoutParams(marginLayoutParams);
        }
        BaseTextView baseTextView2 = this.f44152f;
        if (baseTextView2 != null) {
            int i11 = this.f44167u;
            baseTextView2.setPaddingRelative(i11, 0, i11, 0);
        }
        BaseTextView baseTextView3 = this.f44152f;
        if (baseTextView3 != null) {
            baseTextView3.setBackgroundDrawable(new C42388b().m93043x(this.f44149c.getBoxStrokeWidth()).m93041v(this.f44149c.getBoxStrokeColor()).m93033n(this.f44149c.getBoxCornerRadiusTopStart(), this.f44149c.getBoxCornerRadiusTopEnd(), this.f44149c.getBoxCornerRadiusBottomStart(), this.f44149c.getBoxCornerRadiusBottomEnd()));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m54891J() {
        String strM54897a;
        String str = "";
        if (this.f44163q.compareTo(BigDecimal.ZERO) <= 0) {
            BaseTextView baseTextView = this.f44152f;
            if (baseTextView != null) {
                ViewExtKt.m66577h(baseTextView);
            }
            this.f44149c.setAlpha(1.0f);
            View view = this.f44148b;
            if (view != null) {
                C27046k.m66700o(view);
            }
            BaseTextView baseTextView2 = this.f44152f;
            if (baseTextView2 != null) {
                baseTextView2.setText("");
            }
            getEditText().setText("");
            this.f44168v.getF44174b().removeMessages(0);
        } else {
            getEditText().setText("");
            this.f44149c.setAlpha(0.0f);
            View view2 = this.f44148b;
            if (view2 != null) {
                C27046k.m66685H(view2);
            }
            BaseTextView baseTextView3 = this.f44152f;
            if (baseTextView3 != null) {
                C27046k.m66685H(baseTextView3);
            }
            BaseTextView baseTextView4 = this.f44152f;
            if (baseTextView4 != null) {
                InterfaceC22965b interfaceC22965b = this.f44164r;
                if (interfaceC22965b != null && (strM54897a = interfaceC22965b.m54897a(this.f44163q)) != null) {
                    str = strM54897a;
                }
                baseTextView4.setText(str);
            }
            this.f44150d.setEnabled(true);
            boolean z11 = this.f44163q.compareTo(BigDecimal.ONE) < 0;
            this.f44151e.setEnabled(z11);
            if (!z11) {
                this.f44169w.getF44174b().removeMessages(0);
            }
        }
        InterfaceC22964a interfaceC22964a = this.f44165s;
        if (interfaceC22964a != null) {
            interfaceC22964a.m54896a(this.f44163q);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m54892M() {
        BigDecimal bigDecimalSubtract;
        TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b = this.f44161o;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(true);
        }
        BaseTextView baseTextView = this.f44152f;
        if (baseTextView != null && C27046k.m66704s(baseTextView)) {
            BigDecimal bigDecimalSubtract2 = this.f44163q.subtract(new BigDecimal("0.01"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            this.f44163q = bigDecimalSubtract2;
            m54891J();
            return;
        }
        BigDecimal value = getValue();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (value.compareTo(bigDecimal) == 0) {
            return;
        }
        try {
            if (this.f44143A.compareTo(bigDecimal) == 0 || value.compareTo(this.f44143A) > 0) {
                bigDecimalSubtract = value.subtract(this.f44153g);
                Intrinsics.checkNotNull(bigDecimalSubtract);
            } else {
                bigDecimalSubtract = this.f44143A;
            }
            Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimal, bigDecimalSubtract);
            Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
            setValue((BigDecimal) comparableCoerceAtLeast);
            m54868I();
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "TradeInputLayoutEditor", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: b */
    public void mo54627b(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (C27046k.m66704s(this.f44149c)) {
            BigDecimal scale = m54870L(this, value, this.f44155i, false, 2, null).setScale(this.f44154h, RoundingMode.DOWN);
            if (scale.compareTo(BigDecimal.ZERO) == 0) {
                getEditText().setText("");
                return;
            }
            String plainString = C6447a.m11724a(scale).toPlainString();
            if (Intrinsics.areEqual(plainString, getEditText().getText() != null ? getEditText().getText().toString() : "")) {
                return;
            }
            getEditText().setText(plainString);
            EditText editText = getEditText();
            Editable text = getEditText().getText();
            editText.setSelection(C27039d.m66650j(text != null ? Integer.valueOf(text.length()) : null));
            if (!z11 || getParent() == null) {
                return;
            }
            C5301v0.m6505b(40L);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public EditText getEditText() {
        EditText editText = this.f44149c.getEditText();
        Intrinsics.checkNotNull(editText);
        return editText;
    }

    @NotNull
    /* JADX INFO: renamed from: getInitValue, reason: from getter */
    public final BigDecimal getF44172z() {
        return this.f44172z;
    }

    @NotNull
    /* JADX INFO: renamed from: getLowValue, reason: from getter */
    public final BigDecimal getF44143A() {
        return this.f44143A;
    }

    /* JADX INFO: renamed from: getMUseAddInput, reason: from getter */
    public final boolean getF44170x() {
        return this.f44170x;
    }

    /* JADX INFO: renamed from: getMUseSubInput, reason: from getter */
    public final boolean getF44171y() {
        return this.f44171y;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    /* JADX INFO: renamed from: getPercent, reason: from getter */
    public BigDecimal getF44163q() {
        return this.f44163q;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: getPrecision, reason: from getter */
    public int getF44119f() {
        return this.f44154h;
    }

    public final float getTitleHintTextSize() {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("collapsingTextHelper");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.f44149c);
            Field declaredField2 = obj.getClass().getDeclaredField("collapsedTextSize");
            declaredField2.setAccessible(true);
            return declaredField2.getFloat(obj);
        } catch (Exception e11) {
            C43846g.m96568c(new ComponentException(e11, "TradeInputLayoutEditor", false, null, 8, null), null, 2, null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return C27025c.m66568f(context, 10);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: h */
    public void mo54631h(@Nullable View view, @NotNull String tips, @Nullable TextView textView, long j11) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (textView != null) {
            ViewExtKt.m66577h(textView);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setEnsureIncrement(@NotNull BigDecimal ensureIncrement) {
        Intrinsics.checkNotNullParameter(ensureIncrement, "ensureIncrement");
        this.f44155i = ensureIncrement;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setHint(@Nullable CharSequence hint) {
        boolean zAreEqual;
        CharSequence hint2 = this.f44149c.getHint();
        if (hint2 == null && hint == null) {
            zAreEqual = true;
        } else {
            zAreEqual = (hint2 == null || hint == null) ? false : Intrinsics.areEqual(hint2.toString(), hint.toString());
        }
        if (zAreEqual) {
            return;
        }
        this.f44149c.setHint(hint);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInitValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44172z = value;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11) {
        this.f44159m = l11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setLowValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44143A = value;
    }

    public final void setMUseAddInput(boolean z11) {
        this.f44170x = z11;
    }

    public final void setMUseSubInput(boolean z11) {
        this.f44171y = z11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setOnPercentChangeListener(@NotNull InterfaceC22964a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44165s = listener;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setOnPercentFormatter(@NotNull InterfaceC22965b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44164r = listener;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setPercent(@NotNull BigDecimal percent) {
        Intrinsics.checkNotNullParameter(percent, "percent");
        if (this.f44163q.compareTo(percent) == 0) {
            return;
        }
        this.f44163q = percent;
        m54891J();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11) {
        this.f44160n = l11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSubOrAddClickListener(@Nullable TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b) {
        this.f44161o = interfaceC22960b;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportFloatInputFilter(boolean support2) {
        this.f44162p = support2;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportStepSubAdd(boolean isSupportStepSubAdd) {
        int i11;
        int iM6236a;
        ViewGroup.LayoutParams layoutParams;
        View view = this.f44144B;
        if (view != null) {
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = this.f44145C;
            }
            view.setLayoutParams(layoutParams);
        }
        if (isSupportStepSubAdd) {
            View view2 = this.f44144B;
            if (view2 != null) {
                ViewExtKt.m66594y(view2);
            }
        } else {
            View view3 = this.f44144B;
            if (view3 != null) {
                ViewExtKt.m66577h(view3);
            }
        }
        CheckableImageButton checkableImageButton = (CheckableImageButton) this.f44149c.findViewById(R$id.text_input_end_icon);
        if (checkableImageButton != null) {
            ViewGroup.LayoutParams layoutParams2 = checkableImageButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            checkableImageButton.setMinimumWidth(isSupportStepSubAdd ? checkableImageButton.getMinimumWidth() : 0);
            checkableImageButton.setLayoutParams(marginLayoutParams);
            if (isSupportStepSubAdd) {
                i11 = this.f44147E;
                iM6236a = C5275i0.m6236a(65.0f);
            } else {
                i11 = this.f44147E;
                iM6236a = C5275i0.m6236a(12.0f);
            }
            checkableImageButton.setPaddingRelative(i11 + iM6236a, 0, checkableImageButton.getPaddingEnd(), 0);
        }
        BaseTextView baseTextView = this.f44152f;
        if (baseTextView != null) {
            ViewGroup.LayoutParams layoutParams3 = baseTextView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            setMinimumWidth(isSupportStepSubAdd ? getMinimumWidth() : 0);
            baseTextView.setLayoutParams(marginLayoutParams2);
        }
    }

    public final void setUseAddInput(boolean useAddInput) {
        this.f44170x = useAddInput;
    }

    public final void setUseSubInput(boolean useSubInput) {
        this.f44171y = useSubInput;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo54627b(value, false);
    }

    public /* synthetic */ TradeInputWithPercentLayoutEditor(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: I */
    private final void m54868I() {
        getEditText().setFocusable(true);
        getEditText().setFocusableInTouchMode(true);
        getEditText().requestFocus();
    }

    /* JADX INFO: renamed from: v */
    public static final void m54884v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m54886x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m54887y(TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor, float f11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = tradeInputWithPercentLayoutEditor.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin - (f11 / 2));
            layoutParams2 = marginLayoutParams;
        }
        tradeInputWithPercentLayoutEditor.setLayoutParams(layoutParams2);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: g */
    public void mo54630g(boolean z11) {
        setSelected(z11);
        View.OnFocusChangeListener onFocusChangeListener = this.f44159m;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(getEditText(), z11);
        }
        BigDecimal bigDecimal = this.f44155i;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) != 0 && !z11) {
            try {
                if (getValue().compareTo(bigDecimal2) != 0) {
                    mo54627b(getValue(), false);
                }
            } catch (Exception e11) {
                C43846g.m96568c(new ComponentException(e11, "TradeInputLayoutEditor", false, null, 8, null), null, 2, null);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    public String getInputNumberStr() {
        Editable text = getEditText().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public BigDecimal getValue() {
        String string;
        if (isEnabled() && C27046k.m66704s(this.f44149c)) {
            if (getEditText().getText() != null) {
                string = getEditText().getText().toString();
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNull(bigDecimal);
                return bigDecimal;
            }
            try {
                return new BigDecimal(string);
            } catch (Exception e11) {
                C43846g.m96568c(new ComponentException(e11, "TradeInputLayoutEditor", false, null, 8, null), null, 2, null);
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                Intrinsics.checkNotNull(bigDecimal2);
                return bigDecimal2;
            }
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setHighValue(@NotNull BigDecimal bigDecimal) {
        super.setHighValue(bigDecimal);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setStatusEnabled(boolean enabled) {
        getEditText().setEnabled(enabled);
        this.f44150d.setEnabled(enabled);
        this.f44151e.setEnabled(enabled);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputWithPercentLayoutEditor(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44153g = ZERO;
        this.f44154h = 8;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44155i = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44163q = ZERO;
        int iM66601d = C27029c.m66601d(this, 12);
        this.f44167u = iM66601d;
        C22967d c22967d = new C22967d();
        this.f44168v = c22967d;
        C22966c c22966c = new C22966c();
        this.f44169w = c22966c;
        this.f44170x = true;
        this.f44171y = true;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44172z = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44143A = ZERO;
        this.f44145C = (int) C27025c.m66565c(context, 40);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_TradeInputLayoutEditor);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_tile_height, (int) C27025c.m66565c(context, 40));
        this.f44166t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_tile_is_operator_show, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_reset_top_hint_margin, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_brand_upgrade_style, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z12) {
            LayoutInflater.from(context).inflate(R$layout.view_trade_input_percent_layout_editor_brand_ui, this);
            this.f44148b = findViewById(R$id.borderView);
        } else {
            LayoutInflater.from(context).inflate(R$layout.view_trade_input_percent_layout_editor, this);
        }
        View viewFindViewById = findViewById(R$id.textInput);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44149c = (TextInputLayout) viewFindViewById;
        EditText editText = (EditText) findViewById(R$id.filterEditText);
        editText.setPaddingRelative(iM66601d, editText.getPaddingTop(), iM66601d, editText.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        editText.setLayoutParams(layoutParams);
        View viewFindViewById2 = this.f44149c.findViewById(R$id.text_input_end_icon);
        this.f44146D = viewFindViewById2;
        this.f44147E = viewFindViewById2 != null ? viewFindViewById2.getPaddingStart() : 0;
        this.f44144B = findViewById(R$id.endView);
        setSupportStepSubAdd(this.f44166t);
        final float titleHintTextSize = getTitleHintTextSize();
        if (z11) {
            post(new Runnable() { // from class: com.kubi.resources.widget.d3
                @Override // java.lang.Runnable
                public final void run() {
                    TradeInputWithPercentLayoutEditor.m54887y(this.f44527b, titleHintTextSize);
                }
            });
        }
        post(new Runnable() { // from class: com.kubi.resources.widget.g3
            @Override // java.lang.Runnable
            public final void run() {
                TradeInputWithPercentLayoutEditor.m54888z(this.f44847b, titleHintTextSize);
            }
        });
        View viewFindViewById3 = findViewById(R$id.iv_trade_sub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44150d = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.iv_trade_add);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f44151e = viewFindViewById4;
        this.f44152f = (BaseTextView) findViewById(R$id.percentTextView);
        m54890F();
        getEditText().setInputType(8194);
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.h3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                TradeInputWithPercentLayoutEditor.m54862A(this.f44853b, view, z13);
            }
        });
        this.f44150d.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputWithPercentLayoutEditor.m54863B(this.f44860b, view);
            }
        });
        this.f44150d.setOnTouchListener(c22967d);
        this.f44151e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputWithPercentLayoutEditor.m54864C(this.f44920b, view);
            }
        });
        this.f44151e.setOnTouchListener(c22966c);
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(getEditText());
        final Function1 function1 = new Function1() { // from class: com.kubi.resources.widget.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeInputWithPercentLayoutEditor.m54865D(this.f44936b, (CharSequence) obj));
            }
        };
        Observable<CharSequence> observableFilter = abstractC46099aM784d.filter(new Predicate() { // from class: com.kubi.resources.widget.l3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeInputWithPercentLayoutEditor.m54882t(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.resources.widget.m3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeInputWithPercentLayoutEditor.m54883u(this.f44991b, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.resources.widget.n3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeInputWithPercentLayoutEditor.m54884v(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.resources.widget.e3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeInputWithPercentLayoutEditor.m54885w((Throwable) obj);
            }
        };
        observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.resources.widget.f3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeInputWithPercentLayoutEditor.m54886x(function3, obj);
            }
        });
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: c */
    public void mo54628c(@Nullable CharSequence charSequence, @Nullable TextView textView) {
    }
}
