package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.numeric.financial.widget.KcOrderStyleInputLayout;
import com.kubi.resources.widget.input.SubAddController;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$font;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$style;
import com.kubi.tradebase.R$styleable;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import h30.C38104b;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005*\u0001\u0019\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0085\u0001\u0086\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000eH\u0016J\u0010\u00104\u001a\u00020\u00122\u0006\u0010 \u001a\u00020-H\u0016J\u0010\u00105\u001a\u00020\u00122\u0006\u0010 \u001a\u00020-H\u0016J\u0010\u00106\u001a\u00020\u00122\u0006\u0010 \u001a\u00020-H\u0016J\u0012\u00107\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u000109H\u0016J \u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000eH\u0016J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u000eH\u0016J\b\u0010@\u001a\u00020\bH\u0016J\u0012\u0010A\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010B\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020-H\u0016J\u0010\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u000eH\u0016J\u0018\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020-2\u0006\u0010I\u001a\u00020\u000eH\u0016J\u0012\u0010Q\u001a\u00020\u00122\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\n\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020-H\u0016J\n\u0010X\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010Y\u001a\u00020\u00122\u0006\u0010C\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u000eH\u0016J,\u0010_\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020U2\b\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010e\u001a\u00020fH\u0016J\u001c\u0010g\u001a\u00020\u00122\b\u0010h\u001a\u0004\u0018\u00010S2\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\b\u0010i\u001a\u00020\u0012H\u0014J\b\u0010j\u001a\u0004\u0018\u00010SJ\u000e\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u000eJ\u0018\u0010m\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020SJ\u0018\u0010m\u001a\u00020\u00122\u0006\u0010b\u001a\u00020S2\b\b\u0002\u0010n\u001a\u00020\u000eJ\u000e\u0010o\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u000eJ\u0006\u0010p\u001a\u00020\u000eJ\u000e\u0010q\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u000eJ\u000e\u0010r\u001a\u00020\u00122\u0006\u0010s\u001a\u00020SJ\u0010\u0010t\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010uJ)\u0010v\u001a\u00020\u00122!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ\u000e\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u0017J\b\u0010y\u001a\u00020\u0012H\u0002J\b\u0010z\u001a\u00020\u0015H\u0002J\u0010\u0010{\u001a\u00020\u00122\u0006\u0010|\u001a\u00020\u000eH\u0002J\b\u0010}\u001a\u00020\u0012H\u0002J.\u0010~\u001a\u00020\b2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020dH\u0002R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010%@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020-2\u0006\u0010 \u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u0010J\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006\u0087\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tipsVisibleChangeListeners", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isVisible", "", "bubbleSingleLine", "overlayBubble", "Lcom/cpiz/android/bubbleview/BubbleTextView;", "overlayParent", "Landroid/view/ViewGroup;", "preDrawListener", "com/kubi/resources/widget/KcTradeNumAbInputView$preDrawListener$1", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$preDrawListener$1;", "tradeInputOps", "kcOrderStyleInputLayout", "Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;", "subAddController", "Lcom/kubi/resources/widget/input/SubAddController;", "value", "Lcom/kubi/futures/view/AnimateDrawableEndView;", "typeSelector", "getTypeSelector", "()Lcom/kubi/futures/view/AnimateDrawableEndView;", "Lcom/kubi/resources/widget/BaseTextView;", "disableLabelTv", "getDisableLabelTv", "()Lcom/kubi/resources/widget/BaseTextView;", "labelStubDisableStyle", "originalTopMargin", "updateTopMargin", "resetTopMargin", "Ljava/math/BigDecimal;", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "setSupportStepSubAdd", "isSupportStepSubAdd", "setLowValue", "setHighValue", "setInitValue", "setInnerFocusChangeListener", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnFocusChangeListener;", "setPrecision", "increment", "precision", "followStep", "ensurePrecisions", "hasFocus", "getPrecision", "setRealInnerFocusChanged", "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "setEnsureIncrement", "ensureIncrement", "setSupportFloatInputFilter", "support", "needAnimation", "ctx", "getCtx", "()Landroid/content/Context;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setHint", "hint", "", "getInputNumberStr", "", "setPercent", "percent", "getPercent", "setOnPercentChangeListener", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;", "setOnPercentFormatter", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;", "setStatusEnabled", "enabled", "showTipsAutoDismiss", "anchor", "Landroid/view/View;", "tips", "defaultTipsView", "Landroid/widget/TextView;", TypedValues.TransitionType.S_DURATION, "", "setTipsContent", "content", "onDetachedFromWindow", "getTipsText", "setTipsVisible", ViewProps.VISIBLE, "updateTipsText", "updateVisible", "setTypeSelectorRedPointVisible", "ensureTypeSelectorEnabled", "setTypeSelectorVisible", "setTypeSelectorText", "text", "setTypeSelectorClickListener", "Landroid/view/View$OnClickListener;", "setTipsVisibleChangeListener", "setFloatingTipsParent", "parent", "ensureFloatingTipsInitialized", "createBubbleTextView", "updatePopupVisibility", "focus", "updatePopupPosition", "getBubblePositionX", "gravity", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity;", "editLoc", "", "parentLoc", "bubble", "Companion", "PopXGravity", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKcTradeNumAbInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcTradeNumAbInputView.kt\ncom/kubi/resources/widget/KcTradeNumAbInputView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,729:1\n52#2,9:730\n49#3:739\n65#3,16:740\n93#3,3:756\n256#4,2:759\n256#4,2:761\n1#5:763\n*S KotlinDebug\n*F\n+ 1 KcTradeNumAbInputView.kt\ncom/kubi/resources/widget/KcTradeNumAbInputView\n*L\n106#1:730,9\n232#1:739\n232#1:740,16\n232#1:756,3\n487#1:759,2\n488#1:761,2\n*E\n"})
public final class KcTradeNumAbInputView extends FrameLayout implements ITradeInputLayoutOperations {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f43870n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Map<String, Boolean> f43871o = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    @NotNull
    public Function1<? super Boolean, Unit> f43872b;

    /* JADX INFO: renamed from: c */
    public boolean f43873c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BubbleTextView f43874d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ViewGroup f43875e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ViewTreeObserverOnPreDrawListenerC22925b f43876f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ITradeInputLayoutOperations f43877g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KcOrderStyleInputLayout f43878h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public SubAddController f43879i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public AnimateDrawableEndView f43880j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public BaseTextView f43881k;

    /* JADX INFO: renamed from: l */
    public boolean f43882l;

    /* JADX INFO: renamed from: m */
    public int f43883m;

    /* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputView$Companion;", "", "<init>", "()V", "TAG", "", "remoteConfigs", "", "", "getRemoteConfigs", "()Ljava/util/Map;", "getRemoteConfig", "key", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKcTradeNumAbInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcTradeNumAbInputView.kt\ncom/kubi/resources/widget/KcTradeNumAbInputView$Companion\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,729:1\n35#2,4:730\n39#2:736\n44#3,2:734\n*S KotlinDebug\n*F\n+ 1 KcTradeNumAbInputView.kt\ncom/kubi/resources/widget/KcTradeNumAbInputView$Companion\n*L\n69#1:730,4\n69#1:736\n69#1:734,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$Companion$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C22923a extends TypeToken<Boolean> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean getRemoteConfig(@NotNull String key) {
            Object objM20457a;
            Intrinsics.checkNotNullParameter(key, "key");
            Boolean bool = getRemoteConfigs().get(key);
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C22923a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a(key, type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
            KcTradeNumAbInputView.f43870n.getRemoteConfigs().put(key, Boolean.valueOf(zM66567e));
            return zM66567e;
        }

        @NotNull
        public final Map<String, Boolean> getRemoteConfigs() {
            return KcTradeNumAbInputView.f43871o;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$a */
    /* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity;", "", "Start", "End", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity$End;", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity$Start;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22924a {

        /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$a$a */
        /* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity$End;", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity;", "<init>", "()V", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements InterfaceC22924a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f43884a = new a();
        }

        /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$a$b */
        /* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity$Start;", "Lcom/kubi/resources/widget/KcTradeNumAbInputView$PopXGravity;", "<init>", "()V", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b implements InterfaceC22924a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f43885a = new b();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$b */
    /* JADX INFO: compiled from: KcTradeNumAbInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/KcTradeNumAbInputView$preDrawListener$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnPreDrawListenerC22925b implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC22925b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            KcTradeNumAbInputView.this.m54622B();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcTradeNumAbInputView$c */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 KcTradeNumAbInputView.kt\ncom/kubi/resources/widget/KcTradeNumAbInputView\n*L\n1#1,97:1\n78#2:98\n71#3:99\n233#4,6:100\n*E\n"})
    public static final class C22926c implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Typeface f43888c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Typeface f43889d;

        public C22926c(Typeface typeface, Typeface typeface2) {
            this.f43888c = typeface;
            this.f43889d = typeface2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            if (text == null || text.length() == 0) {
                KcTradeNumAbInputView.this.getEditText().setTypeface(this.f43888c);
            } else {
                KcTradeNumAbInputView.this.getEditText().setTypeface(this.f43889d);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTradeNumAbInputView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTradeNumAbInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m54606A(boolean z11) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m54607F(KcTradeNumAbInputView kcTradeNumAbInputView, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        kcTradeNumAbInputView.m54625E(charSequence, z11);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m54619u(KcTradeNumAbInputView kcTradeNumAbInputView, View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        kcTradeNumAbInputView.m54623C(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m54620v(KcTradeNumAbInputView kcTradeNumAbInputView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kcTradeNumAbInputView.m54623C(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m54622B() {
        ViewGroup viewGroup;
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView == null || (viewGroup = this.f43875e) == null || bubbleTextView.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        getEditText().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        int iM54635x = m54635x(this.f43878h == null ? InterfaceC22924a.a.f43884a : InterfaceC22924a.b.f43885a, iArr, iArr2, bubbleTextView);
        int height = (iArr[1] - iArr2[1]) - bubbleTextView.getHeight();
        bubbleTextView.setX(iM54635x);
        bubbleTextView.setY(height);
    }

    /* JADX INFO: renamed from: C */
    public final void m54623C(boolean z11) {
        CharSequence text;
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView == null) {
            return;
        }
        boolean z12 = z11 && getEditText().getGlobalVisibleRect(new Rect()) && (text = bubbleTextView.getText()) != null && text.length() != 0;
        setTipsVisible(z12);
        if (z12) {
            m54622B();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m54624D(@Nullable View view, @NotNull CharSequence tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (!Intrinsics.areEqual(this.f43875e, view)) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                setFloatingTipsParent(viewGroup);
            }
        }
        m54607F(this, tips, false, 2, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m54625E(@NotNull CharSequence tips, boolean z11) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        m54633t();
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView != null) {
            bubbleTextView.setText(tips);
        }
        if (z11) {
            m54623C(tips.length() > 0 && getEditText().hasFocus());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m54626G() {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        Float fValueOf = null;
        if (iTradeInputLayoutOperations instanceof TradeInputLayoutEditor) {
            TradeInputLayoutEditor tradeInputLayoutEditor = iTradeInputLayoutOperations instanceof TradeInputLayoutEditor ? (TradeInputLayoutEditor) iTradeInputLayoutOperations : null;
            if (tradeInputLayoutEditor != null) {
                fValueOf = Float.valueOf(tradeInputLayoutEditor.getTitleHintTextSize());
            }
        } else if (iTradeInputLayoutOperations instanceof TradeInputWithPercentLayoutEditor) {
            TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor = iTradeInputLayoutOperations instanceof TradeInputWithPercentLayoutEditor ? (TradeInputWithPercentLayoutEditor) iTradeInputLayoutOperations : null;
            if (tradeInputWithPercentLayoutEditor != null) {
                fValueOf = Float.valueOf(tradeInputWithPercentLayoutEditor.getTitleHintTextSize());
            }
        }
        if (fValueOf != null) {
            final float fFloatValue = fValueOf.floatValue();
            post(new Runnable() { // from class: com.kubi.resources.widget.v0
                @Override // java.lang.Runnable
                public final void run() {
                    KcTradeNumAbInputView.m54608H(this.f45230b, fFloatValue);
                }
            });
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: b */
    public void mo54627b(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.mo54627b(value, z11);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55353V(value, z11);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: c */
    public void mo54628c(@Nullable CharSequence charSequence, @Nullable TextView textView) {
        if (charSequence == null) {
            charSequence = "";
        }
        m54625E(charSequence, false);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: f */
    public void mo54629f(@NotNull BigDecimal increment, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(increment, "increment");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.mo54629f(increment, i11, z11);
                return;
            }
            return;
        }
        KcOrderStyleInputLayout kcOrderStyleInputLayout = this.f43878h;
        if (kcOrderStyleInputLayout != null) {
            kcOrderStyleInputLayout.setMaxDecimalPlaces(i11);
        }
        SubAddController subAddController = this.f43879i;
        if (subAddController != null) {
            subAddController.m55349R(increment, i11, z11);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: g */
    public void mo54630g(boolean z11) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.mo54630g(z11);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55362q(z11);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getDisableLabelTv, reason: from getter */
    public final BaseTextView getF43881k() {
        return this.f43881k;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public EditText getEditText() {
        EditText editText;
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null && (editText = iTradeInputLayoutOperations.getEditText()) != null) {
            return editText;
        }
        KcOrderStyleInputLayout kcOrderStyleInputLayout = this.f43878h;
        if (kcOrderStyleInputLayout != null) {
            return kcOrderStyleInputLayout.getF36423c();
        }
        throw new NullPointerException("editText is null");
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    public String getInputNumberStr() {
        FinancialInputEditText editText;
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                return iTradeInputLayoutOperations.getInputNumberStr();
            }
            return null;
        }
        KcOrderStyleInputLayout kcOrderStyleInputLayout = this.f43878h;
        if (kcOrderStyleInputLayout == null || (editText = kcOrderStyleInputLayout.getF36423c()) == null) {
            return null;
        }
        return editText.getRawInput();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    /* JADX INFO: renamed from: getPercent */
    public BigDecimal getF44163q() {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                return iTradeInputLayoutOperations.getF44163q();
            }
            return null;
        }
        SubAddController subAddController = this.f43879i;
        if (subAddController != null) {
            return subAddController.getF44891p();
        }
        return null;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: getPrecision */
    public int getF44119f() {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        Integer numValueOf = null;
        if (iTradeInputLayoutOperations == null) {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                numValueOf = Integer.valueOf(subAddController.getF44885j());
            }
        } else if (iTradeInputLayoutOperations != null) {
            numValueOf = Integer.valueOf(iTradeInputLayoutOperations.getF44119f());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 8;
    }

    @Nullable
    public final CharSequence getTipsText() {
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView != null) {
            return bubbleTextView.getText();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getTypeSelector, reason: from getter */
    public final AnimateDrawableEndView getF43880j() {
        return this.f43880j;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public BigDecimal getValue() {
        BigDecimal value;
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null && (value = iTradeInputLayoutOperations.getValue()) != null) {
            return value;
        }
        SubAddController subAddController = this.f43879i;
        if (subAddController != null) {
            return subAddController.m55369x();
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: h */
    public void mo54631h(@Nullable View view, @NotNull String tips, @Nullable TextView textView, long j11) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        KcTradeNumAbInputViewExt.f43890a.m54639b(this, view, tips, j11);
        if (textView != null) {
            ViewExtKt.m66577h(textView);
        }
    }

    /* JADX INFO: renamed from: r */
    public final BubbleTextView m54632r() {
        final BubbleTextView bubbleTextView = new BubbleTextView(getContext());
        bubbleTextView.setId(R$id.kc_trade_num_ab_input_view_bubble_tips);
        bubbleTextView.mo6996a(C5275i0.m6236a(8.0f), C5275i0.m6236a(2.0f), C5275i0.m6236a(5.0f), C5275i0.m6236a(2.0f));
        bubbleTextView.setTextSize(2, 10.0f);
        bubbleTextView.setTypeface(ResourcesCompat.getFont(bubbleTextView.getContext(), R$font.regular));
        bubbleTextView.setArrowDirection(this.f43878h == null ? BubbleStyle.ArrowDirection.Down : BubbleStyle.ArrowDirection.None);
        bubbleTextView.setCornerRadius(C5275i0.m6236a(4.0f));
        bubbleTextView.setArrowHeight(C5275i0.m6236a(6.0f));
        bubbleTextView.setArrowWidth(C5275i0.m6236a(10.0f));
        bubbleTextView.setFillColor(ContextCompat.getColor(bubbleTextView.getContext(), R$color.c_toolTip));
        bubbleTextView.setTextColor(-1);
        bubbleTextView.setVisibility(8);
        if (this.f43873c) {
            bubbleTextView.setMaxLines(1);
            bubbleTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        bubbleTextView.post(new Runnable() { // from class: com.kubi.resources.widget.a1
            @Override // java.lang.Runnable
            public final void run() {
                KcTradeNumAbInputView.m54618s(bubbleTextView, this);
            }
        });
        return bubbleTextView;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setEnsureIncrement(@NotNull BigDecimal ensureIncrement) {
        Intrinsics.checkNotNullParameter(ensureIncrement, "ensureIncrement");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setEnsureIncrement(ensureIncrement);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55342K(ensureIncrement);
            }
        }
    }

    public final void setFloatingTipsParent(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f43875e = parent;
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView != null) {
            ViewParent parent2 = bubbleTextView != null ? bubbleTextView.getParent() : null;
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f43874d);
            }
            ViewGroup viewGroup2 = this.f43875e;
            if (viewGroup2 != null) {
                viewGroup2.addView(this.f43874d, new FrameLayout.LayoutParams(-2, -2));
            }
            m54622B();
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setHighValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setHighValue(value);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55343L(value);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setHint(@Nullable CharSequence hint) {
        TextInputLayout textInputLayout;
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setHint(hint);
            }
        } else {
            KcOrderStyleInputLayout kcOrderStyleInputLayout = this.f43878h;
            if (kcOrderStyleInputLayout == null || (textInputLayout = kcOrderStyleInputLayout.getF36422b()) == null) {
                return;
            }
            textInputLayout.setHint(hint);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInitValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setInitValue(value);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55344M(value);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setInnerFocusChangeListener(l11);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.setInnerFocusChangeListener(l11);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setLowValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setLowValue(value);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55345N(value);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setOnPercentChangeListener(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22964a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setOnPercentChangeListener(listener);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.setOnPercentChangeListener(listener);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setOnPercentFormatter(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22965b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setOnPercentFormatter(listener);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55346O(listener);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setPercent(@NotNull BigDecimal percent) {
        Intrinsics.checkNotNullParameter(percent, "percent");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setPercent(percent);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55347P(percent);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setRealInnerFocusChanged(l11);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.setRealInnerFocusChanged(l11);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSubOrAddClickListener(@Nullable TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setSubOrAddClickListener(interfaceC22960b);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.setSubOrAddClickListener(interfaceC22960b);
            }
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportFloatInputFilter(boolean support2) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations == null || iTradeInputLayoutOperations == null) {
            return;
        }
        iTradeInputLayoutOperations.setSupportFloatInputFilter(support2);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportStepSubAdd(boolean isSupportStepSubAdd) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setSupportStepSubAdd(isSupportStepSubAdd);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55351T(isSupportStepSubAdd);
            }
        }
    }

    public final void setTipsVisible(boolean visible) {
        BubbleTextView bubbleTextView = this.f43874d;
        if (bubbleTextView != null) {
            bubbleTextView.setVisibility(visible ? 0 : 8);
        }
        this.f43872b.invoke(Boolean.valueOf(visible));
    }

    public final void setTipsVisibleChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43872b = listener;
    }

    public final void setTypeSelectorClickListener(@Nullable View.OnClickListener listener) {
        AnimateDrawableEndView animateDrawableEndView = this.f43880j;
        if (animateDrawableEndView != null) {
            animateDrawableEndView.setOnClickListener(listener);
        }
    }

    public final void setTypeSelectorRedPointVisible(boolean visible) {
        AnimateDrawableEndView animateDrawableEndView = this.f43880j;
        if (animateDrawableEndView != null) {
            animateDrawableEndView.setRedPointVisible(visible);
        }
    }

    public final void setTypeSelectorText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        AnimateDrawableEndView animateDrawableEndView = this.f43880j;
        if (animateDrawableEndView != null) {
            animateDrawableEndView.setText(text);
        }
    }

    public final void setTypeSelectorVisible(boolean visible) {
        AnimateDrawableEndView animateDrawableEndView = this.f43880j;
        if (animateDrawableEndView != null) {
            animateDrawableEndView.setVisibility(visible ? 0 : 8);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
        if (iTradeInputLayoutOperations != null) {
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setValue(value);
            }
        } else {
            SubAddController subAddController = this.f43879i;
            if (subAddController != null) {
                subAddController.m55352U(value);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m54633t() {
        if (this.f43874d != null) {
            return;
        }
        if (this.f43875e == null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            this.f43875e = viewGroup;
            if (viewGroup == null) {
                return;
            }
        }
        BubbleTextView bubbleTextViewM54632r = m54632r();
        ViewGroup viewGroup2 = this.f43875e;
        if (viewGroup2 != null) {
            viewGroup2.addView(bubbleTextViewM54632r, new FrameLayout.LayoutParams(-2, -2));
        }
        this.f43874d = bubbleTextViewM54632r;
        C38104b.m86032d(getEditText(), new Function2() { // from class: com.kubi.resources.widget.y0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KcTradeNumAbInputView.m54619u(this.f45350b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        ViewExtKt.m66575f(getEditText(), new Function1() { // from class: com.kubi.resources.widget.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KcTradeNumAbInputView.m54620v(this.f45354b, (View) obj);
            }
        });
        getEditText().getViewTreeObserver().addOnPreDrawListener(this.f43876f);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m54634w() {
        SubAddController subAddController = this.f43879i;
        if (subAddController == null) {
            return false;
        }
        subAddController.m55363r();
        AnimateDrawableEndView animateDrawableEndViewM55368w = subAddController.getF44894s();
        this.f43880j = animateDrawableEndViewM55368w;
        if (animateDrawableEndViewM55368w != null) {
            animateDrawableEndViewM55368w.setVisibility(0);
        }
        return this.f43880j != null;
    }

    /* JADX INFO: renamed from: x */
    public final int m54635x(InterfaceC22924a interfaceC22924a, int[] iArr, int[] iArr2, TextView textView) {
        int width;
        int width2;
        if (Intrinsics.areEqual(interfaceC22924a, InterfaceC22924a.b.f43885a)) {
            if (getLayoutDirection() == 1) {
                width = (iArr[0] - iArr2[0]) + getEditText().getWidth();
                width2 = textView.getWidth();
            } else {
                width = iArr[0];
                width2 = iArr2[0];
            }
        } else {
            if (!Intrinsics.areEqual(interfaceC22924a, InterfaceC22924a.a.f43884a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (getLayoutDirection() == 1) {
                width = iArr[0];
                width2 = iArr2[0];
            } else {
                width = (iArr[0] - iArr2[0]) + getEditText().getWidth();
                width2 = textView.getWidth();
            }
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: y */
    public final void m54636y() {
        post(new Runnable() { // from class: com.kubi.resources.widget.u0
            @Override // java.lang.Runnable
            public final void run() {
                KcTradeNumAbInputView.m54621z(this.f45221b);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTradeNumAbInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: H */
    public static final void m54608H(KcTradeNumAbInputView kcTradeNumAbInputView, float f11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = kcTradeNumAbInputView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) (kcTradeNumAbInputView.f43883m - (f11 / 2));
            layoutParams2 = marginLayoutParams;
        }
        kcTradeNumAbInputView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: i */
    public static void m54609i(KcTradeNumAbInputView kcTradeNumAbInputView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = kcTradeNumAbInputView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            kcTradeNumAbInputView.f43883m = marginLayoutParams.topMargin;
            layoutParams2 = marginLayoutParams;
        }
        kcTradeNumAbInputView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: s */
    public static final void m54618s(BubbleTextView bubbleTextView, KcTradeNumAbInputView kcTradeNumAbInputView) {
        bubbleTextView.setMaxWidth(kcTradeNumAbInputView.getEditText().getWidth());
    }

    /* JADX INFO: renamed from: z */
    public static final void m54621z(KcTradeNumAbInputView kcTradeNumAbInputView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = kcTradeNumAbInputView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = kcTradeNumAbInputView.f43883m;
            layoutParams2 = marginLayoutParams;
        }
        kcTradeNumAbInputView.setLayoutParams(layoutParams2);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getEditText().getViewTreeObserver().removeOnPreDrawListener(this.f43876f);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setStatusEnabled(boolean enabled) {
        View view;
        int i11;
        setEnabled(enabled);
        if (this.f43877g != null) {
            if (enabled) {
                m54626G();
            } else {
                m54636y();
            }
            if (this.f43882l) {
                BaseTextView baseTextView = this.f43881k;
                int i12 = 8;
                if (baseTextView != null) {
                    if (!enabled) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    baseTextView.setVisibility(i11);
                }
                Object obj = this.f43877g;
                if (obj instanceof View) {
                    view = (View) obj;
                } else {
                    view = null;
                }
                if (view != null) {
                    if (enabled) {
                        i12 = 0;
                    }
                    view.setVisibility(i12);
                }
            }
            ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f43877g;
            if (iTradeInputLayoutOperations != null) {
                iTradeInputLayoutOperations.setStatusEnabled(enabled);
                return;
            }
            return;
        }
        SubAddController subAddController = this.f43879i;
        if (subAddController != null) {
            subAddController.m55350S(enabled);
        }
    }

    public /* synthetic */ KcTradeNumAbInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTradeNumAbInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Context context2;
        ConstraintLayout constraintLayout;
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43872b = new Function1() { // from class: com.kubi.resources.widget.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KcTradeNumAbInputView.m54606A(((Boolean) obj).booleanValue());
            }
        };
        this.f43876f = new ViewTreeObserverOnPreDrawListenerC22925b();
        int[] KcTradeNumAbInputViewStyle = R$styleable.KcTradeNumAbInputViewStyle;
        Intrinsics.checkNotNullExpressionValue(KcTradeNumAbInputViewStyle, "KcTradeNumAbInputViewStyle");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KcTradeNumAbInputViewStyle, 0, 0);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_support_type_selector, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_tile_is_operator_show, true);
        this.f43882l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_label_stub_disable_style, false);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_support_percent, false);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_support_use_new_style, false);
        this.f43873c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcTradeNumAbInputViewStyle_kucoin_bubble_tips_single_line, false);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.KcTradeNumAbInputViewStyle_kucoin_remote_config_key);
        boolean remoteConfig = f43870n.getRemoteConfig(string == null ? "kumex_use_new_style_num_input" : string);
        if (remoteConfig || z14) {
            KcOrderStyleInputLayout kcOrderStyleInputLayout = new KcOrderStyleInputLayout(context, null, 0, 6, null);
            context2 = context;
            this.f43878h = kcOrderStyleInputLayout;
            addView(kcOrderStyleInputLayout, -1, C5275i0.m6236a(40.0f));
            KcOrderStyleInputLayout kcOrderStyleInputLayout2 = this.f43878h;
            if (kcOrderStyleInputLayout2 != null) {
                SubAddController subAddController = new SubAddController(this, z13, z11, z12, kcOrderStyleInputLayout2);
                this.f43879i = subAddController;
                this.f43880j = subAddController.getF44894s();
            }
        } else {
            if (z13) {
                TradeInputWithPercentLayoutEditor tradeInputWithPercentLayoutEditor = new TradeInputWithPercentLayoutEditor(new ContextThemeWrapper(context, R$style.Widget_KCPercentInputLayoutEditorBrandUpgradeStyle), null, 0, 6, null);
                this.f43877g = tradeInputWithPercentLayoutEditor;
                tradeInputWithPercentLayoutEditor.setSupportStepSubAdd(z12);
                View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_trade_input_layout_percent_with_type_selector, (ViewGroup) null);
                constraintLayout = viewInflate instanceof ConstraintLayout ? (ConstraintLayout) viewInflate : null;
                if (constraintLayout != null) {
                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
                    int i13 = R$id.typeSelectorDrawableEndView;
                    layoutParams.topToBottom = i13;
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C27029c.m66599b(context, 4);
                    Unit unit = Unit.INSTANCE;
                    constraintLayout.addView(tradeInputWithPercentLayoutEditor, layoutParams);
                    AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) constraintLayout.findViewById(i13);
                    this.f43880j = animateDrawableEndView;
                    if (z11) {
                        if (animateDrawableEndView != null) {
                            C27046k.m66685H(animateDrawableEndView);
                        }
                    } else if (animateDrawableEndView != null) {
                        C27046k.m66700o(animateDrawableEndView);
                    }
                    addView(constraintLayout, -1, -2);
                }
            } else {
                TradeInputLayoutEditor tradeInputLayoutEditor = new TradeInputLayoutEditor(new ContextThemeWrapper(context, R$style.Widget_KCInputLayoutEditorBrandUpgradeStyle), null, 0, 6, null);
                this.f43877g = tradeInputLayoutEditor;
                tradeInputLayoutEditor.setSupportStepSubAdd(z12);
                View viewInflate2 = LayoutInflater.from(context).inflate(R$layout.btradebase_view_trade_input_layout_legacy, (ViewGroup) null);
                constraintLayout = viewInflate2 instanceof ConstraintLayout ? (ConstraintLayout) viewInflate2 : null;
                if (constraintLayout != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
                    int i14 = R$id.typeSelectorDrawableEndView;
                    layoutParams2.endToStart = i14;
                    layoutParams2.startToStart = 0;
                    layoutParams2.bottomToBottom = 0;
                    layoutParams2.topToTop = 0;
                    layoutParams2.setMarginEnd(C5275i0.m6236a(5.0f));
                    layoutParams2.goneEndMargin = 0;
                    Unit unit2 = Unit.INSTANCE;
                    constraintLayout.addView(tradeInputLayoutEditor, layoutParams2);
                    this.f43880j = (AnimateDrawableEndView) constraintLayout.findViewById(i14);
                    this.f43881k = (BaseTextView) constraintLayout.findViewById(R$id.disableLabelTv);
                    if (z11) {
                        AnimateDrawableEndView animateDrawableEndView2 = this.f43880j;
                        if (animateDrawableEndView2 != null) {
                            C27046k.m66685H(animateDrawableEndView2);
                        }
                    } else {
                        AnimateDrawableEndView animateDrawableEndView3 = this.f43880j;
                        if (animateDrawableEndView3 != null) {
                            C27046k.m66700o(animateDrawableEndView3);
                        }
                    }
                    addView(constraintLayout, -1, -2);
                }
                post(new Runnable() { // from class: com.kubi.resources.widget.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        KcTradeNumAbInputView.m54609i(this.f45347b);
                    }
                });
                setStatusEnabled(isEnabled());
            }
            context2 = context;
        }
        AnimateDrawableEndView animateDrawableEndView4 = this.f43880j;
        if (animateDrawableEndView4 != null) {
            animateDrawableEndView4.setUsedInNewStyleNumInputView(remoteConfig);
        }
        typedArrayObtainStyledAttributes.recycle();
        getEditText().addTextChangedListener(new C22926c(ResourcesCompat.getFont(context2, R$font.regular), ResourcesCompat.getFont(context2, R$font.medium)));
    }
}
