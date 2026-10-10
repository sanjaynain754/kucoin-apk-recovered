package com.kubi.redpackage.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.redpackage.R$drawable;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.entity.RedpacketDetailEntity;
import com.kubi.redpackage.utils.StringsExtKt;
import com.kubi.redpackage.view.RedpacketHeaderView;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p675uv.C45317c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketHeaderView.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/redpackage/view/RedpacketHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/redpackage/databinding/BredpackageViewDetailHeaderBinding;", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfo", "code", "", "setData", "", "info", "Lcom/kubi/redpackage/entity/RedpacketDetailEntity;", "fillWelfareStatus", "largeText", "smallText", "recievingStatus", "overStatus", "expireStatus", "showRetry", "retryClick", "Landroid/view/View$OnClickListener;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RedpacketHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C45317c f43398b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public CoinInfoEntity f43399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpacketHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bredpackage_view_detail_header, this);
        this.f43398b = C45317c.m100188a(findViewById(R$id.layoutRoot));
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m54097g(RedpacketHeaderView redpacketHeaderView, boolean z11) {
        RedPacketCoverBgMaskView redPacketCoverBgMaskView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        LinearLayout linearLayout;
        C45317c c45317c = redpacketHeaderView.f43398b;
        if (c45317c != null && (linearLayout = c45317c.f101899f) != null) {
            linearLayout.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        C45317c c45317c2 = redpacketHeaderView.f43398b;
        if (c45317c2 != null && (textView3 = c45317c2.f101906m) != null) {
            textView3.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        C45317c c45317c3 = redpacketHeaderView.f43398b;
        if (c45317c3 != null && (textView2 = c45317c3.f101901h) != null) {
            textView2.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        C45317c c45317c4 = redpacketHeaderView.f43398b;
        if (c45317c4 != null && (textView = c45317c4.f101905l) != null) {
            textView.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        C45317c c45317c5 = redpacketHeaderView.f43398b;
        if (c45317c5 != null && (redPacketCoverBgMaskView = c45317c5.f101895b) != null) {
            redPacketCoverBgMaskView.setVisibility(z11 ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m54098b(RedpacketDetailEntity redpacketDetailEntity, String str, String str2) {
        C45317c c45317c = this.f43398b;
        if (c45317c == null) {
            return;
        }
        if (C27025c.m66566d(redpacketDetailEntity.isReceive())) {
            ConstraintLayout layoutAmount = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount, "layoutAmount");
            ViewExtKt.m66594y(layoutAmount);
            TextView tvTip = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip, "tvTip");
            C27046k.m66703r(tvTip);
            c45317c.f101901h.setText(str);
            c45317c.f101905l.setText(str2);
        } else {
            ConstraintLayout layoutAmount2 = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount2, "layoutAmount");
            C27046k.m66703r(layoutAmount2);
            TextView tvTip2 = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip2, "tvTip");
            ViewExtKt.m66594y(tvTip2);
            c45317c.f101906m.setText(R$string.redpacket_expired);
        }
        if (Intrinsics.areEqual(redpacketDetailEntity.getReceiveNum(), redpacketDetailEntity.getSendNum())) {
            Integer sendNum = redpacketDetailEntity.getSendNum();
            String strM66426m = (sendNum != null && sendNum.intValue() == 1) ? TimeUtils.m66426m(C27039d.m66652l(redpacketDetailEntity.getLastAt()) - C27039d.m66652l(redpacketDetailEntity.getSendAt())) : TimeUtils.m66426m(C27039d.m66652l(redpacketDetailEntity.getLastAt()) - C27039d.m66652l(redpacketDetailEntity.getFirstAt()));
            TextView textView = c45317c.f101903j;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.redpacket_received;
            Integer sendNum2 = redpacketDetailEntity.getSendNum();
            StringBuilder sb2 = new StringBuilder();
            BigDecimal sendAmount = redpacketDetailEntity.getSendAmount();
            sb2.append(sendAmount != null ? C37885i.m85570i(sendAmount, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
            sb2.append(' ');
            CoinInfoEntity coinInfoEntityM54100d = m54100d(redpacketDetailEntity.getCurrency());
            sb2.append(coinInfoEntityM54100d != null ? coinInfoEntityM54100d.getCurrency() : null);
            textView.setText(c27017c.m66516f(i11, sendNum2, sb2.toString(), strM66426m));
            return;
        }
        TextView textView2 = c45317c.f101903j;
        C27017c c27017c2 = C27017c.f54310a;
        int i12 = R$string.redpacket_receiving_new;
        Integer receiveNum = redpacketDetailEntity.getReceiveNum();
        Integer sendNum3 = redpacketDetailEntity.getSendNum();
        StringBuilder sb3 = new StringBuilder();
        BigDecimal sendAmount2 = redpacketDetailEntity.getSendAmount();
        sb3.append(sendAmount2 != null ? C37885i.m85570i(sendAmount2, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
        sb3.append(' ');
        CoinInfoEntity coinInfoEntityM54100d2 = m54100d(redpacketDetailEntity.getCurrency());
        sb3.append(coinInfoEntityM54100d2 != null ? coinInfoEntityM54100d2.getCurrency() : null);
        String string = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalRemainAmount = redpacketDetailEntity.remainAmount();
        sb4.append(bigDecimalRemainAmount != null ? C37885i.m85570i(bigDecimalRemainAmount, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
        sb4.append(' ');
        CoinInfoEntity coinInfoEntityM54100d3 = m54100d(redpacketDetailEntity.getCurrency());
        sb4.append(coinInfoEntityM54100d3 != null ? coinInfoEntityM54100d3.getCurrency() : null);
        textView2.setText(c27017c2.m66516f(i12, receiveNum, sendNum3, string, sb4.toString()));
    }

    /* JADX INFO: renamed from: d */
    public final CoinInfoEntity m54100d(String str) {
        if (this.f43399c == null) {
            this.f43399c = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        }
        return this.f43399c;
    }

    /* JADX INFO: renamed from: e */
    public final void m54101e(RedpacketDetailEntity redpacketDetailEntity, String str, String str2) {
        C45317c c45317c = this.f43398b;
        if (c45317c == null) {
            return;
        }
        if (C27025c.m66566d(redpacketDetailEntity.isReceive())) {
            ConstraintLayout layoutAmount = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount, "layoutAmount");
            ViewExtKt.m66594y(layoutAmount);
            TextView tvTip = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip, "tvTip");
            C27046k.m66703r(tvTip);
            c45317c.f101901h.setText(str);
            c45317c.f101905l.setText(str2);
        } else {
            ConstraintLayout layoutAmount2 = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount2, "layoutAmount");
            C27046k.m66703r(layoutAmount2);
            TextView tvTip2 = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip2, "tvTip");
            ViewExtKt.m66594y(tvTip2);
            c45317c.f101906m.setText(R$string.redpacket_run_out);
        }
        Integer sendNum = redpacketDetailEntity.getSendNum();
        String strM66426m = (sendNum != null && sendNum.intValue() == 1) ? TimeUtils.m66426m(C27039d.m66652l(redpacketDetailEntity.getLastAt()) - C27039d.m66652l(redpacketDetailEntity.getSendAt())) : TimeUtils.m66426m(C27039d.m66652l(redpacketDetailEntity.getLastAt()) - C27039d.m66652l(redpacketDetailEntity.getFirstAt()));
        TextView textView = c45317c.f101903j;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.redpacket_received;
        Integer sendNum2 = redpacketDetailEntity.getSendNum();
        StringBuilder sb2 = new StringBuilder();
        BigDecimal sendAmount = redpacketDetailEntity.getSendAmount();
        sb2.append(sendAmount != null ? C37885i.m85570i(sendAmount, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
        sb2.append(' ');
        CoinInfoEntity coinInfoEntityM54100d = m54100d(redpacketDetailEntity.getCurrency());
        sb2.append(coinInfoEntityM54100d != null ? coinInfoEntityM54100d.getCurrency() : null);
        textView.setText(c27017c.m66516f(i11, sendNum2, sb2.toString(), strM66426m));
    }

    /* JADX INFO: renamed from: f */
    public final void m54102f(RedpacketDetailEntity redpacketDetailEntity, String str, String str2) {
        TextView textView;
        C45317c c45317c = this.f43398b;
        if (c45317c == null) {
            return;
        }
        if (C27025c.m66566d(redpacketDetailEntity.isReceive())) {
            ConstraintLayout layoutAmount = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount, "layoutAmount");
            ViewExtKt.m66594y(layoutAmount);
            TextView tvTip = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip, "tvTip");
            C27046k.m66703r(tvTip);
            c45317c.f101901h.setText(str);
            c45317c.f101905l.setText(str2);
        } else {
            ConstraintLayout layoutAmount2 = c45317c.f101897d;
            Intrinsics.checkNotNullExpressionValue(layoutAmount2, "layoutAmount");
            C27046k.m66703r(layoutAmount2);
            TextView tvTip2 = c45317c.f101906m;
            Intrinsics.checkNotNullExpressionValue(tvTip2, "tvTip");
            ViewExtKt.m66594y(tvTip2);
            c45317c.f101906m.setText(C27041f.m66668h(redpacketDetailEntity.getBestWishes()));
        }
        C45317c c45317c2 = this.f43398b;
        if (c45317c2 == null || (textView = c45317c2.f101903j) == null) {
            return;
        }
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.redpacket_receiving_new;
        Integer receiveNum = redpacketDetailEntity.getReceiveNum();
        Integer sendNum = redpacketDetailEntity.getSendNum();
        StringBuilder sb2 = new StringBuilder();
        BigDecimal sendAmount = redpacketDetailEntity.getSendAmount();
        sb2.append(sendAmount != null ? C37885i.m85570i(sendAmount, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
        sb2.append(' ');
        CoinInfoEntity coinInfoEntityM54100d = m54100d(redpacketDetailEntity.getCurrency());
        sb2.append(coinInfoEntityM54100d != null ? coinInfoEntityM54100d.getCurrency() : null);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        BigDecimal bigDecimalRemainAmount = redpacketDetailEntity.remainAmount();
        sb3.append(bigDecimalRemainAmount != null ? C37885i.m85570i(bigDecimalRemainAmount, redpacketDetailEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
        sb3.append(' ');
        CoinInfoEntity coinInfoEntityM54100d2 = m54100d(redpacketDetailEntity.getCurrency());
        sb3.append(coinInfoEntityM54100d2 != null ? coinInfoEntityM54100d2.getCurrency() : null);
        textView.setText(c27017c.m66516f(i11, receiveNum, sendNum, string, sb3.toString()));
    }

    @SuppressLint({"SetTextI18n"})
    public final void setData(@NotNull RedpacketDetailEntity info) {
        String string;
        RedPacketCoverBgView redPacketCoverBgView;
        Integer receiveStatus;
        TextView textView;
        TextView textView2;
        TextView textView3;
        ConstraintLayout constraintLayout;
        BigDecimal receiveAmount;
        BigDecimal receiveAmount2;
        BigDecimal receiveAmount3;
        BigDecimal receiveAmount4;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(info, "info");
        C45317c c45317c = this.f43398b;
        if (c45317c != null && (constraintLayout2 = c45317c.f101898e) != null) {
            constraintLayout2.setVisibility(0);
        }
        C45317c c45317c2 = this.f43398b;
        if (c45317c2 != null && (textView6 = c45317c2.f101904k) != null) {
            textView6.setVisibility(4);
        }
        C45317c c45317c3 = this.f43398b;
        if (c45317c3 != null && (textView5 = c45317c3.f101902i) != null) {
            textView5.setText(info.getNickName());
        }
        C45317c c45317c4 = this.f43398b;
        if (c45317c4 != null && (textView4 = c45317c4.f101907n) != null) {
            Integer welfareType = info.getWelfareType();
            textView4.setVisibility((welfareType == null || welfareType.intValue() != 0) ? 8 : 0);
        }
        RedpacketDetailEntity.ReceiveEntity receive = info.getReceive();
        double dM66646f = C27039d.m66646f((receive == null || (receiveAmount4 = receive.getReceiveAmount()) == null) ? null : Double.valueOf(receiveAmount4.doubleValue()));
        RedpacketDetailEntity.ReceiveEntity receive2 = info.getReceive();
        double dM66646f2 = C27039d.m66646f((receive2 == null || (receiveAmount3 = receive2.getReceiveAmount()) == null) ? null : Double.valueOf(C41014a.m89940n(receiveAmount3, info.getCurrency())));
        RedpacketDetailEntity.ReceiveEntity receive3 = info.getReceive();
        String strM85570i = (receive3 == null || (receiveAmount2 = receive3.getReceiveAmount()) == null) ? null : C37885i.m85570i(receiveAmount2, info.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null);
        RedpacketDetailEntity.ReceiveEntity receive4 = info.getReceive();
        String strM89948v = (receive4 == null || (receiveAmount = receive4.getReceiveAmount()) == null) ? null : C41014a.m89948v(C41014a.m89940n(receiveAmount, info.getCurrency()), null, null, 0, false, true, false, 47, null);
        if (dM66646f > dM66646f2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM85570i);
            sb2.append(' ');
            CoinInfoEntity coinInfoEntityM54100d = m54100d(info.getCurrency());
            sb2.append(coinInfoEntityM54100d != null ? coinInfoEntityM54100d.getCurrency() : null);
            string = sb2.toString();
        } else {
            string = strM89948v;
        }
        if (dM66646f <= dM66646f2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strM85570i);
            sb3.append(' ');
            CoinInfoEntity coinInfoEntityM54100d2 = m54100d(info.getCurrency());
            sb3.append(coinInfoEntityM54100d2 != null ? coinInfoEntityM54100d2.getCurrency() : null);
            strM89948v = sb3.toString();
        }
        m54099c(info, string, strM89948v);
        RedpacketDetailEntity.ReceiveEntity receive5 = info.getReceive();
        if (receive5 != null && (receiveStatus = receive5.getReceiveStatus()) != null && receiveStatus.intValue() == 12) {
            C45317c c45317c5 = this.f43398b;
            if (c45317c5 != null && (constraintLayout = c45317c5.f101897d) != null) {
                ViewExtKt.m66594y(constraintLayout);
            }
            C45317c c45317c6 = this.f43398b;
            if (c45317c6 != null && (textView3 = c45317c6.f101906m) != null) {
                C27046k.m66703r(textView3);
            }
            C45317c c45317c7 = this.f43398b;
            if (c45317c7 != null && (textView2 = c45317c7.f101901h) != null) {
                textView2.setText(R$string.redpacket_return);
            }
            C45317c c45317c8 = this.f43398b;
            if (c45317c8 != null && (textView = c45317c8.f101905l) != null) {
                textView.setText(R$string.redpacket_return_tip);
            }
        }
        C45317c c45317c9 = this.f43398b;
        if (c45317c9 == null || (redPacketCoverBgView = c45317c9.f101896c) == null) {
            return;
        }
        StringsExtKt.loadImage(redPacketCoverBgView, info.getExtendUrl(), new Function1() { // from class: aw.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedpacketHeaderView.m54097g(this.f3830b, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void showRetry(@NotNull View.OnClickListener retryClick) {
        TextView textView;
        TextView textView2;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(retryClick, "retryClick");
        C45317c c45317c = this.f43398b;
        if (c45317c != null && (constraintLayout = c45317c.f101898e) != null) {
            constraintLayout.setVisibility(4);
        }
        C45317c c45317c2 = this.f43398b;
        if (c45317c2 != null && (textView2 = c45317c2.f101904k) != null) {
            textView2.setVisibility(0);
        }
        C45317c c45317c3 = this.f43398b;
        if (c45317c3 == null || (textView = c45317c3.f101904k) == null) {
            return;
        }
        textView.setOnClickListener(retryClick);
    }

    /* JADX INFO: renamed from: c */
    public final void m54099c(RedpacketDetailEntity redpacketDetailEntity, String str, String str2) {
        Integer welfareStatus = redpacketDetailEntity.getWelfareStatus();
        if (welfareStatus != null && welfareStatus.intValue() == 3) {
            m54098b(redpacketDetailEntity, str, str2);
            return;
        }
        if (welfareStatus != null && welfareStatus.intValue() == 2) {
            m54101e(redpacketDetailEntity, str, str2);
        } else if (welfareStatus != null && welfareStatus.intValue() == 1) {
            m54102f(redpacketDetailEntity, str, str2);
        }
    }
}
