package zd0;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.bugly.proguard.C33978va;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: zd0.d */
/* JADX INFO: compiled from: BattleCountdownDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "anchorManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "mCountdownView", "Landroid/widget/TextView;", "mTipView", "mCountdownValue", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startCountdown", "formatTip", "", "formatTime", "second", "cancelBattle", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogC46765d extends Dialog {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AnchorStore f104639b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LiveKitLogger f104640c;

    /* JADX INFO: renamed from: d */
    public TextView f104641d;

    /* JADX INFO: renamed from: e */
    public TextView f104642e;

    /* JADX INFO: renamed from: f */
    public int f104643f;

    /* JADX INFO: renamed from: zd0.d$a */
    /* JADX INFO: compiled from: BattleCountdownDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownDialog$cancelBattle$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements CompletionHandler {
        public a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            DialogC46765d.this.f104640c.m79403a("BattleCountdownDialog cancelBattle failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: zd0.d$b */
    /* JADX INFO: compiled from: BattleCountdownDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownDialog$startCountdown$countdownRunnable$1", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = DialogC46765d.this.f104642e;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                textView = null;
            }
            textView.setText(DialogC46765d.this.m103053k());
            TextView textView3 = DialogC46765d.this.f104641d;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCountdownView");
                textView3 = null;
            }
            DialogC46765d dialogC46765d = DialogC46765d.this;
            textView3.setText(dialogC46765d.m103052j(dialogC46765d.f104643f));
            DialogC46765d.this.f104643f--;
            if (DialogC46765d.this.f104643f < 0) {
                DialogC46765d.this.dismiss();
                return;
            }
            TextView textView4 = DialogC46765d.this.f104641d;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCountdownView");
            } else {
                textView2 = textView4;
            }
            textView2.postDelayed(this, 1000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC46765d(@NotNull Context context, @NotNull AnchorStore anchorManager) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorManager, "anchorManager");
        this.f104639b = anchorManager;
        this.f104640c = LiveKitLogger.f77564c.getFeaturesLogger("BattleCountdownDialog");
        this.f104643f = 10;
    }

    /* JADX INFO: renamed from: i */
    public final void m103051i() {
        ArrayList arrayList = new ArrayList();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID = value != null ? value.getUserID() : null;
        for (SeatUserInfo seatUserInfo : CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected().getValue()) {
            if (!Intrinsics.areEqual(seatUserInfo.getUserID(), userID)) {
                arrayList.add(seatUserInfo.getUserID());
            }
        }
        String battleId = this.f104639b.m80232i().getBattleId();
        this.f104639b.getF78177j().m80207s();
        BattleStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).cancelBattleRequest(battleId, arrayList, new a());
    }

    /* JADX INFO: renamed from: j */
    public final String m103052j(int i11) {
        if (i11 <= 0) {
            return "00:00";
        }
        if (i11 < 60) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 % 60)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public final void m103054m() {
        b bVar = new b();
        TextView textView = this.f104641d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCountdownView");
            textView = null;
        }
        textView.post(bVar);
    }

    /* JADX INFO: renamed from: l */
    public static final void m103050l(DialogC46765d dialogC46765d, View view) {
        dialogC46765d.m103051i();
    }

    /* JADX INFO: renamed from: k */
    public final String m103053k() {
        String string = getContext().getString(R$string.common_battle_wait_start);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        StringBuilder sb2 = new StringBuilder(string);
        int i11 = 2 - (this.f104643f % 3);
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                sb2.append(C33978va.f72339h);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.livekit_battle_count_down_view);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View viewFindViewById = findViewById(R$id.tv_countdown);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f104641d = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f104642e = (TextView) viewFindViewById2;
        ((TextView) findViewById(R$id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: zd0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC46765d.m103050l(this.f104638b, view);
            }
        });
        m103054m();
    }
}
