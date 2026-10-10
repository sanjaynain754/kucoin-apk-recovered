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
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002ghB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010)\u001a\u00020\u001aH\u0002J\u0006\u0010*\u001a\u00020\u0011J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0011H\u0016J\u0006\u0010/\u001a\u00020\u0011J\u0006\u00100\u001a\u000201J\u0012\u00102\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020,H\u0002J\u0012\u00106\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u001aJ\u000e\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u001aJ\u0006\u0010;\u001a\u00020,J\u0010\u0010<\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J \u0010=\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001aH\u0016J\b\u0010?\u001a\u00020\bH\u0016J\u0012\u0010@\u001a\u00020,2\b\u0010A\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010B\u001a\u00020,H\u0002J\u0010\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020\u001aH\u0016J\u0018\u0010E\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u001aH\u0016J\n\u0010J\u001a\u0004\u0018\u00010KH\u0016J\n\u0010L\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020\u001aH\u0016J\u0012\u0010O\u001a\u00020,2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020\u001aH\u0016J,\u0010T\u001a\u00020,2\b\u0010U\u001a\u0004\u0018\u00010\u000e2\u0006\u0010V\u001a\u00020K2\b\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020ZH\u0016J\u001c\u0010[\u001a\u00020,2\b\u0010\\\u001a\u0004\u0018\u00010Q2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u001e\u0010d\u001a\u00020\u0011*\u00020\u00112\u0006\u0010d\u001a\u00020\u00112\b\b\u0002\u0010e\u001a\u00020\u001aH\u0002J\u0014\u0010f\u001a\u00020\u001a*\u00020\u00112\u0006\u0010d\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010-\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010]\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006i"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutEditor;", "Landroid/widget/LinearLayout;", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "ivTradeSub", "Landroid/view/View;", "ivTradeAdd", "increment", "Ljava/math/BigDecimal;", "precision", "ensureIncrement", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnFocusChangeListener;", "innerFocus", "subListener", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "isSupportFloatInputFilter", "", "mUseAddInput", "getMUseAddInput", "()Z", "setMUseAddInput", "(Z)V", "mUseSubInput", "getMUseSubInput", "setMUseSubInput", "initValue", "lowValue", "endView", "tileHeight", "textInputEndIcon", "textInputEndIconInitialPaddingStart", "lessThanLowerValue", "getLowValue", "setLowValue", "", "value", "setInitValue", "getInitValue", "getTitleHintTextSize", "", "setInnerFocusChangeListener", "ensurePrecisions", "hasFocus", "subInput", "setRealInnerFocusChanged", "setUseAddInput", "useAddInput", "setUseSubInput", "useSubInput", "addInput", "setEnsureIncrement", "setPrecision", "followStep", "getPrecision", "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "requestF", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "setSupportStepSubAdd", "isSupportStepSubAdd", "needAnimation", "getInputNumberStr", "", "getPercent", "setStatusEnabled", "enabled", "setHint", "hint", "", "setSupportFloatInputFilter", "support", "showTipsAutoDismiss", "anchor", "tips", "defaultTipsView", "Landroid/widget/TextView;", TypedValues.TransitionType.S_DURATION, "", "setTipsContent", "content", "ctx", "getCtx", "()Landroid/content/Context;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "step", "isDown", "isStepped", "OnLongTouchListener", "OnSubOrAddClickListener", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult", "InflateParams"})
@SourceDebugExtension({"SMAP\nTradeInputLayoutEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeInputLayoutEditor.kt\ncom/kubi/resources/widget/TradeInputLayoutEditor\n+ 2 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,699:1\n44#2,2:700\n44#2,2:702\n44#2,2:704\n44#2,2:706\n326#3,4:708\n*S KotlinDebug\n*F\n+ 1 TradeInputLayoutEditor.kt\ncom/kubi/resources/widget/TradeInputLayoutEditor\n*L\n227#1:700,2\n251#1:702,2\n273#1:704,2\n374#1:706,2\n392#1:708,4\n*E\n"})
public final class TradeInputLayoutEditor extends LinearLayout implements ITradeInputLayoutOperations {

    /* JADX INFO: renamed from: b */
    @NotNull
    public TextInputLayout f44115b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public View f44116c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public View f44117d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public BigDecimal f44118e;

    /* JADX INFO: renamed from: f */
    public int f44119f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public BigDecimal f44120g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public View.OnFocusChangeListener f44121h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public View.OnFocusChangeListener f44122i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC22960b f44123j;

    /* JADX INFO: renamed from: k */
    public boolean f44124k;

    /* JADX INFO: renamed from: l */
    public boolean f44125l;

    /* JADX INFO: renamed from: m */
    public boolean f44126m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public BigDecimal f44127n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public BigDecimal f44128o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public View f44129p;

    /* JADX INFO: renamed from: q */
    public int f44130q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public View f44131r;

    /* JADX INFO: renamed from: s */
    public int f44132s;

    /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "performLongTouch", "", "onLongTouch", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class OnLongTouchListener implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final Companion f44133c = new Companion(null);

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Handler f44134b = new HandlerC22958a();

        /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener$Companion;", "", "<init>", "()V", "MSG_LONG_TOUCH", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputLayoutEditor$OnLongTouchListener$a */
        /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SuppressLint({"HandlerLeak"})
        public static final class HandlerC22958a extends Handler {
            public HandlerC22958a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 0) {
                    OnLongTouchListener.this.m54853c();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo54852b();

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Handler getF44134b() {
            return this.f44134b;
        }

        /* JADX INFO: renamed from: c */
        public final void m54853c() {
            this.f44134b.sendEmptyMessageDelayed(0, ViewConfiguration.getTapTimeout());
            mo54852b();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View v11, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 0) {
                this.f44134b.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
            }
            if (event.getAction() == 3 || event.getAction() == 1) {
                this.f44134b.removeMessages(0);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputLayoutEditor$a */
    /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/TradeInputLayoutEditor$6", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22959a extends OnLongTouchListener {
        public C22959a() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54852b() {
            if (TradeInputLayoutEditor.this.getF44125l()) {
                TradeInputLayoutEditor.this.m54850z();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputLayoutEditor$b */
    /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "", "click", "", "isSub", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22960b {
        /* JADX INFO: renamed from: a */
        void mo22972a(boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputLayoutEditor$c */
    /* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/TradeInputLayoutEditor$subLongTouchListener$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;", "onLongTouch", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22961c extends OnLongTouchListener {
        public C22961c() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.OnLongTouchListener
        /* JADX INFO: renamed from: b */
        public void mo54852b() {
            if (TradeInputLayoutEditor.this.getF44126m()) {
                TradeInputLayoutEditor.this.m54828F();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputLayoutEditor(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: f */
    public void mo54629f(@NotNull BigDecimal increment, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(increment, "increment");
        this.f44119f = i11;
        this.f44118e = increment;
        if (z11) {
            setEnsureIncrement(increment);
        }
        if (i11 <= 0) {
            getEditText().setInputType(2);
        } else {
            getEditText().setInputType(8194);
        }
        if (this.f44124k) {
            getEditText().setFilters(new InputFilter[]{new C27056j0(i11), new FloatInputFilter()});
        } else {
            getEditText().setFilters(new InputFilter[]{new C27056j0(i11)});
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    /* JADX INFO: renamed from: getPercent */
    public BigDecimal getF44163q() {
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputLayoutEditor(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ BigDecimal m54827E(TradeInputLayoutEditor tradeInputLayoutEditor, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return tradeInputLayoutEditor.m54849D(bigDecimal, bigDecimal2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m54828F() {
        BigDecimal bigDecimalSubtract;
        InterfaceC22960b interfaceC22960b = this.f44123j;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(true);
        }
        BigDecimal value = getValue();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (value.compareTo(bigDecimal) == 0) {
            return;
        }
        try {
            if (this.f44128o.compareTo(bigDecimal) == 0 || value.compareTo(this.f44128o) > 0) {
                bigDecimalSubtract = value.subtract(this.f44118e);
                Intrinsics.checkNotNull(bigDecimalSubtract);
            } else {
                bigDecimalSubtract = this.f44128o;
            }
            Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimal, bigDecimalSubtract);
            Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
            setValue((BigDecimal) comparableCoerceAtLeast);
            m54848C();
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "TradeInputLayoutEditor", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m54838r(TradeInputLayoutEditor tradeInputLayoutEditor, View view, boolean z11) {
        View.OnFocusChangeListener onFocusChangeListener = tradeInputLayoutEditor.f44122i;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(tradeInputLayoutEditor.getEditText(), z11);
        }
        tradeInputLayoutEditor.mo54630g(z11);
    }

    /* JADX INFO: renamed from: s */
    public static final void m54839s(TradeInputLayoutEditor tradeInputLayoutEditor, View view) {
        if (tradeInputLayoutEditor.f44126m) {
            tradeInputLayoutEditor.m54828F();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m54840t(TradeInputLayoutEditor tradeInputLayoutEditor, View view) {
        if (tradeInputLayoutEditor.f44125l) {
            tradeInputLayoutEditor.m54850z();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m54841u(TradeInputLayoutEditor tradeInputLayoutEditor, OnLongTouchListener onLongTouchListener, CharSequence charSequence) {
        tradeInputLayoutEditor.f44116c.setEnabled((TextUtils.isEmpty(charSequence) || tradeInputLayoutEditor.m54847B() || !tradeInputLayoutEditor.getEditText().isEnabled()) ? false : true);
        if (!tradeInputLayoutEditor.f44116c.isEnabled()) {
            onLongTouchListener.getF44134b().removeMessages(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m54843w(Throwable obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        C44128b.m97264h(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m54846A(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        return bigDecimal2.compareTo(bigDecimal3) == 0 || bigDecimal.remainder(bigDecimal2).compareTo(bigDecimal3) == 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m54847B() {
        return this.f44128o.compareTo(BigDecimal.ZERO) != 0 && getValue().compareTo(this.f44128o) <= 0;
    }

    /* JADX INFO: renamed from: D */
    public final BigDecimal m54849D(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11) {
        if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0 || m54846A(bigDecimal, bigDecimal2)) {
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

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: b */
    public void mo54627b(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal scale = m54827E(this, value, this.f44120g, false, 2, null).setScale(this.f44119f, RoundingMode.DOWN);
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

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: c */
    public void mo54628c(@Nullable CharSequence charSequence, @Nullable TextView textView) {
        if (textView != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public EditText getEditText() {
        EditText editText = this.f44115b.getEditText();
        Intrinsics.checkNotNull(editText);
        return editText;
    }

    @NotNull
    /* JADX INFO: renamed from: getInitValue, reason: from getter */
    public final BigDecimal getF44127n() {
        return this.f44127n;
    }

    @NotNull
    /* JADX INFO: renamed from: getLowValue, reason: from getter */
    public final BigDecimal getF44128o() {
        return this.f44128o;
    }

    /* JADX INFO: renamed from: getMUseAddInput, reason: from getter */
    public final boolean getF44125l() {
        return this.f44125l;
    }

    /* JADX INFO: renamed from: getMUseSubInput, reason: from getter */
    public final boolean getF44126m() {
        return this.f44126m;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: getPrecision, reason: from getter */
    public int getF44154h() {
        return this.f44119f;
    }

    public final float getTitleHintTextSize() {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("collapsingTextHelper");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.f44115b);
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
            textView.setText(tips);
        }
        if (textView != null) {
            ViewExtKt.m66594y(textView);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setEnsureIncrement(@NotNull BigDecimal ensureIncrement) {
        Intrinsics.checkNotNullParameter(ensureIncrement, "ensureIncrement");
        this.f44120g = ensureIncrement;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setHint(@Nullable CharSequence hint) {
        this.f44115b.setHint(hint);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInitValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44127n = value;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11) {
        this.f44121h = l11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setLowValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44128o = value;
    }

    public final void setMUseAddInput(boolean z11) {
        this.f44125l = z11;
    }

    public final void setMUseSubInput(boolean z11) {
        this.f44126m = z11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11) {
        this.f44122i = l11;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSubOrAddClickListener(@Nullable InterfaceC22960b interfaceC22960b) {
        this.f44123j = interfaceC22960b;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportFloatInputFilter(boolean support2) {
        this.f44124k = support2;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportStepSubAdd(boolean isSupportStepSubAdd) {
        int i11;
        int iM6236a;
        ViewGroup.LayoutParams layoutParams;
        View view = this.f44129p;
        if (view != null) {
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = this.f44130q;
            }
            view.setLayoutParams(layoutParams);
        }
        if (isSupportStepSubAdd) {
            View view2 = this.f44129p;
            if (view2 != null) {
                ViewExtKt.m66594y(view2);
            }
        } else {
            View view3 = this.f44129p;
            if (view3 != null) {
                ViewExtKt.m66577h(view3);
            }
        }
        View view4 = this.f44131r;
        if (view4 != null) {
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            view4.setMinimumWidth(isSupportStepSubAdd ? view4.getMinimumWidth() : 0);
            view4.setLayoutParams(marginLayoutParams);
            if (isSupportStepSubAdd) {
                i11 = this.f44132s;
                iM6236a = C5275i0.m6236a(65.0f);
            } else {
                i11 = this.f44132s;
                iM6236a = C5275i0.m6236a(12.0f);
            }
            view4.setPaddingRelative(i11 + iM6236a, 0, view4.getPaddingEnd(), 0);
        }
    }

    public final void setUseAddInput(boolean useAddInput) {
        this.f44125l = useAddInput;
    }

    public final void setUseSubInput(boolean useSubInput) {
        this.f44126m = useSubInput;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo54627b(value, false);
    }

    public /* synthetic */ TradeInputLayoutEditor(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: q */
    public static final void m54837q(TradeInputLayoutEditor tradeInputLayoutEditor, float f11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = tradeInputLayoutEditor.getLayoutParams();
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
        tradeInputLayoutEditor.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: v */
    public static final void m54842v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m54844x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public final void m54848C() {
        getEditText().setFocusable(true);
        getEditText().setFocusableInTouchMode(true);
        getEditText().requestFocus();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: g */
    public void mo54630g(boolean z11) {
        setSelected(z11);
        View.OnFocusChangeListener onFocusChangeListener = this.f44121h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(getEditText(), z11);
        }
        BigDecimal bigDecimal = this.f44120g;
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
        if (!isEnabled()) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
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

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setHighValue(@NotNull BigDecimal bigDecimal) {
        super.setHighValue(bigDecimal);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setOnPercentChangeListener(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22964a interfaceC22964a) {
        super.setOnPercentChangeListener(interfaceC22964a);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setOnPercentFormatter(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22965b interfaceC22965b) {
        super.setOnPercentFormatter(interfaceC22965b);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setPercent(@NotNull BigDecimal bigDecimal) {
        super.setPercent(bigDecimal);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setStatusEnabled(boolean enabled) {
        getEditText().setEnabled(enabled);
        this.f44116c.setEnabled(enabled);
        this.f44117d.setEnabled(enabled);
    }

    /* JADX INFO: renamed from: z */
    public final void m54850z() {
        BigDecimal bigDecimalAdd;
        BigDecimal value = getValue();
        BigDecimal bigDecimal = this.f44127n;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) != 0 && value.compareTo(bigDecimal2) == 0 && this.f44127n.compareTo(this.f44118e) > 0) {
            bigDecimalAdd = this.f44127n;
        } else {
            bigDecimalAdd = value.add(this.f44118e);
            Intrinsics.checkNotNull(bigDecimalAdd);
        }
        setValue(bigDecimalAdd);
        m54848C();
        InterfaceC22960b interfaceC22960b = this.f44123j;
        if (interfaceC22960b != null) {
            Intrinsics.checkNotNull(interfaceC22960b);
            interfaceC22960b.mo22972a(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputLayoutEditor(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44118e = ZERO;
        this.f44119f = 8;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44120g = ZERO;
        this.f44125l = true;
        this.f44126m = true;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44127n = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f44128o = ZERO;
        this.f44130q = (int) C27025c.m66565c(context, 40);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_TradeInputLayoutEditor);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f44130q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_tile_height, (int) C27025c.m66565c(context, 40));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_tile_is_operator_show, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_reset_top_hint_margin, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TradeInputLayoutEditor_kucoin_brand_upgrade_style, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z13) {
            LayoutInflater.from(context).inflate(R$layout.view_trade_input_layout_editor_brand_ui, this);
        } else {
            LayoutInflater.from(context).inflate(R$layout.view_trade_input_layout_editor, this);
        }
        View viewFindViewById = findViewById(R$id.textInput);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44115b = (TextInputLayout) viewFindViewById;
        EditText editText = (EditText) findViewById(R$id.filterEditText);
        editText.setPaddingRelative(C27029c.m66601d(this, 12), editText.getPaddingTop(), C27029c.m66601d(this, 12), editText.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        layoutParams.height = this.f44130q;
        editText.setLayoutParams(layoutParams);
        this.f44129p = findViewById(R$id.endView);
        View viewFindViewById2 = this.f44115b.findViewById(R$id.text_input_end_icon);
        this.f44131r = viewFindViewById2;
        this.f44132s = viewFindViewById2 != null ? viewFindViewById2.getPaddingStart() : 0;
        setSupportStepSubAdd(z11);
        if (z12) {
            final float titleHintTextSize = getTitleHintTextSize();
            post(new Runnable() { // from class: com.kubi.resources.widget.l2
                @Override // java.lang.Runnable
                public final void run() {
                    TradeInputLayoutEditor.m54837q(this.f44939b, titleHintTextSize);
                }
            });
        }
        View viewFindViewById3 = findViewById(R$id.iv_trade_sub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44116c = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.iv_trade_add);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f44117d = viewFindViewById4;
        getEditText().setInputType(8194);
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.m2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z14) {
                TradeInputLayoutEditor.m54838r(this.f44990b, view, z14);
            }
        });
        this.f44116c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputLayoutEditor.m54839s(this.f45000b, view);
            }
        });
        final C22961c c22961c = new C22961c();
        this.f44116c.setOnTouchListener(c22961c);
        this.f44117d.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputLayoutEditor.m54840t(this.f45011b, view);
            }
        });
        this.f44117d.setOnTouchListener(new C22959a());
        Observable<CharSequence> observableObserveOn = C0206f.m784d(getEditText()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.resources.widget.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeInputLayoutEditor.m54841u(this.f45016b, c22961c, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.resources.widget.q2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeInputLayoutEditor.m54842v(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.resources.widget.r2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeInputLayoutEditor.m54843w((Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.resources.widget.s2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeInputLayoutEditor.m54844x(function2, obj);
            }
        });
    }
}
