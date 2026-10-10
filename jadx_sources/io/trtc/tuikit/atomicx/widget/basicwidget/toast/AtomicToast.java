package io.trtc.tuikit.atomicx.widget.basicwidget.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33579c5;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.trtc.tuikit.atomicx.R$dimen;
import io.trtc.tuikit.atomicx.R$drawable;
import io.trtc.tuikit.atomicx.R$id;
import io.trtc.tuikit.atomicx.R$layout;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AtomicToast.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003+,-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJA\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010!JA\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&J\u0017\u0010'\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010(J0\u0010)\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;", "", "<init>", "()V", "toastRef", "Ljava/lang/ref/WeakReference;", "Landroid/widget/Toast;", "layoutRef", "Landroid/view/View;", "mainHandler", "Landroid/os/Handler;", "pendingTask", "Ljava/lang/Runnable;", TIMPushProvider.f75062n, "", "context", "Landroid/content/Context;", "text", "", TtmlNode.TAG_STYLE, "Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;", ViewProps.POSITION, "Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;", "customIcon", "", TypedValues.TransitionType.S_DURATION, "Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;", "code", "extensionInfo", "", "(Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;)V", "executeRealShow", "appContext", "(Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;)V", "applyDesignTokens", TtmlNode.RUBY_CONTAINER, "tokens", "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;)V", "resolveIconRes", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;)Ljava/lang/Integer;", "reportAtomicEvent", "message", "Style", "Position", "Duration", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AtomicToast {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static WeakReference<Toast> f87567b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static WeakReference<View> f87568c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static Runnable f87570e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AtomicToast f87566a = new AtomicToast();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Handler f87569d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: AtomicToast.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", SharedPositionInfo.SIDE_SHORT, SharedPositionInfo.SIDE_LONG, "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Duration {
        SHORT(0),
        LONG(1);


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87572c = EnumEntriesKt.enumEntries(m88202a());
        private final int value;

        @NotNull
        public static EnumEntries<Duration> getEntries() {
            return f87572c;
        }

        public final int getValue() {
            return this.value;
        }

        Duration(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: compiled from: AtomicToast.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Position {
        TOP,
        CENTER,
        BOTTOM;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87574c = EnumEntriesKt.enumEntries(m88203a());

        @NotNull
        public static EnumEntries<Position> getEntries() {
            return f87574c;
        }
    }

    /* JADX INFO: compiled from: AtomicToast.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "INFO", "HELP", "LOADING", AppConstants.AB_TEST_SUCCESS, "WARNING", "ERROR", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Style {
        TEXT,
        INFO,
        HELP,
        LOADING,
        SUCCESS,
        WARNING,
        ERROR;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87576c = EnumEntriesKt.enumEntries(m88204a());

        @NotNull
        public static EnumEntries<Style> getEntries() {
            return f87576c;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast$b */
    /* JADX INFO: compiled from: AtomicToast.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"io/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$show$task$1", "Ljava/lang/Runnable;", "run", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC39387b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f87577b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f87578c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Style f87579d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Position f87580e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Integer f87581f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Duration f87582g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Integer f87583h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Map<String, Object> f87584i;

        public RunnableC39387b(Context context, String str, Style style, Position position, Integer num, Duration duration, Integer num2, Map<String, ? extends Object> map) {
            this.f87577b = context;
            this.f87578c = str;
            this.f87579d = style;
            this.f87580e = position;
            this.f87581f = num;
            this.f87582g = duration;
            this.f87583h = num2;
            this.f87584i = map;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = this.f87577b;
            Intrinsics.checkNotNull(context);
            atomicToast.m88198f(context, this.f87578c, this.f87579d, this.f87580e, this.f87581f, this.f87582g);
            Integer num = this.f87583h;
            if (num != null) {
                atomicToast.m88199g(num.intValue(), this.f87578c, this.f87584i);
            }
            if (AtomicToast.f87570e == this) {
                AtomicToast.f87570e = null;
            }
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast$a */
    /* JADX INFO: compiled from: AtomicToast.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39386a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Position.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Position.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Style.values().length];
            try {
                iArr2[Style.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Style.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Style.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Style.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Style.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Style.LOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m88196j(AtomicToast atomicToast, Context context, String str, Style style, Position position, Integer num, Duration duration, Integer num2, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            style = Style.TEXT;
        }
        Style style2 = style;
        if ((i11 & 8) != 0) {
            position = Position.CENTER;
        }
        atomicToast.m88201i(context, str, style2, position, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? Duration.SHORT : duration, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : map);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m88197e(Context context, View view, String str, Style style, @DrawableRes Integer num, DesignTokenSet designTokenSet) {
        ImageView imageView = (ImageView) view.findViewById(R$id.image_icon);
        TextView textView = (TextView) view.findViewById(R$id.text_toast);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R$dimen.radius_6));
        gradientDrawable.setColor(designTokenSet.getColor().getBgColorOperate());
        view.setBackground(gradientDrawable);
        textView.setText(str);
        textView.setTextColor(designTokenSet.getColor().getTextColorPrimary());
        textView.setTextSize(designTokenSet.getFont().getRegular14().getSize());
        imageView.setVisibility(8);
        if (num == null) {
            num = m88200h(style);
        }
        if (num != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(num.intValue());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m88198f(Context context, String str, Style style, Position position, @DrawableRes Integer num, Duration duration) {
        int i11;
        DesignTokenSet tokens = ThemeStore.f87316e.shared(context).m87980c().getValue().getCurrentTheme().getTokens();
        WeakReference<Toast> weakReference = f87567b;
        Toast toast = weakReference != null ? weakReference.get() : null;
        WeakReference<View> weakReference2 = f87568c;
        View viewInflate = weakReference2 != null ? weakReference2.get() : null;
        if (toast == null || viewInflate == null) {
            viewInflate = LayoutInflater.from(context).inflate(R$layout.layout_atomic_toast, (ViewGroup) null);
            toast = new Toast(context);
            toast.setView(viewInflate);
            f87568c = new WeakReference<>(viewInflate);
            f87567b = new WeakReference<>(toast);
        }
        View view = viewInflate;
        Intrinsics.checkNotNull(view);
        m88197e(context, view, str, style, num, tokens);
        toast.setDuration(duration.getValue());
        int i12 = C39386a.$EnumSwitchMapping$0[position.ordinal()];
        if (i12 == 1) {
            i11 = 49;
        } else if (i12 == 2) {
            i11 = 17;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 81;
        }
        int dimension = (int) context.getResources().getDimension(R$dimen.spacing_20);
        if (position == Position.CENTER) {
            dimension = 0;
        }
        toast.setGravity(i11, 0, dimension);
        toast.show();
    }

    /* JADX INFO: renamed from: g */
    public final void m88199g(int i11, String str, Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_id", C33579c5.f69379q);
        jSONObject.put("event_code", i11);
        jSONObject.put("event_message", str);
        jSONObject.put("more_message", "AtomicXCore");
        jSONObject.put("extension_message", map);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportRoomEngineEvent", string, null);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public final Integer m88200h(Style style) {
        switch (C39386a.$EnumSwitchMapping$1[style.ordinal()]) {
            case 1:
                return Integer.valueOf(R$drawable.ic_atomic_toast_info);
            case 2:
                return Integer.valueOf(R$drawable.ic_atomic_toast_help);
            case 3:
                return Integer.valueOf(R$drawable.ic_atomic_toast_success);
            case 4:
                return Integer.valueOf(R$drawable.ic_atomic_toast_warning);
            case 5:
                return Integer.valueOf(R$drawable.ic_atomic_toast_error);
            case 6:
                return Integer.valueOf(R$drawable.ic_atomic_toast_loading);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m88201i(@NotNull Context context, @NotNull String text, @NotNull Style style, @NotNull Position position, @DrawableRes @Nullable Integer num, @NotNull Duration duration, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(duration, "duration");
        if (StringsKt.isBlank(text)) {
            return;
        }
        Runnable runnable = f87570e;
        if (runnable != null) {
            f87569d.removeCallbacks(runnable);
            f87570e = null;
        }
        RunnableC39387b runnableC39387b = new RunnableC39387b(context.getApplicationContext(), text, style, position, num, duration, num2, map);
        f87570e = runnableC39387b;
        f87569d.postDelayed(runnableC39387b, 50L);
    }
}
