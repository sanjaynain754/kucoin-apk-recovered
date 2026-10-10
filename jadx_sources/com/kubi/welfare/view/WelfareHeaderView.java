package com.kubi.welfare.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.welfare.R$id;
import com.kubi.welfare.R$layout;
import com.kubi.welfare.R$string;
import com.kubi.welfare.api.entity.WelfareInfoEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import m80.C42487a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareHeaderView.kt */
/* JADX INFO: loaded from: classes58.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/welfare/view/WelfareHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "type", "", "<init>", "(Landroid/content/Context;I)V", "getType", "()I", "binding", "Lcom/kubi/welfare/databinding/KucoinLayoutWelfareHeaderBinding;", "setData", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "Companion", "WelfareHeaderType", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class WelfareHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f54976d = new Companion(null);

    /* JADX INFO: renamed from: b */
    public final int f54977b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C42487a f54978c;

    /* JADX INFO: compiled from: WelfareHeaderView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/welfare/view/WelfareHeaderView$Companion;", "", "<init>", "()V", "INVITE", "", "ENCOURAGE", "OTHER", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelfareHeaderView(@NotNull Context context, int i11) {
        TextView textView;
        ConstraintLayout constraintLayout;
        TextView textView2;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54977b = i11;
        LayoutInflater.from(context).inflate(R$layout.kucoin_layout_welfare_header, this);
        C42487a c42487aM93175a = C42487a.m93175a(findViewById(R$id.layoutRoot));
        this.f54978c = c42487aM93175a;
        if (i11 == 1) {
            if (c42487aM93175a != null && (constraintLayout = c42487aM93175a.f94141b) != null) {
                constraintLayout.setVisibility(0);
            }
            C42487a c42487a = this.f54978c;
            if (c42487a == null || (textView = c42487a.f94145f) == null) {
                return;
            }
            textView.setText(context.getString(R$string.invite_num));
            return;
        }
        if (i11 != 2) {
            if (i11 != 3 || c42487aM93175a == null || (constraintLayout3 = c42487aM93175a.f94141b) == null) {
                return;
            }
            constraintLayout3.setVisibility(8);
            return;
        }
        if (c42487aM93175a != null && (constraintLayout2 = c42487aM93175a.f94141b) != null) {
            constraintLayout2.setVisibility(0);
        }
        C42487a c42487a2 = this.f54978c;
        if (c42487a2 == null || (textView2 = c42487a2.f94145f) == null) {
            return;
        }
        textView2.setText(context.getString(R$string.hold_kcs_num));
    }

    /* JADX INFO: renamed from: getType, reason: from getter */
    public final int getF54977b() {
        return this.f54977b;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    @SuppressLint({"SetTextI18n"})
    public final void setData(@Nullable WelfareInfoEntity.WelfareDetailEntity entity) {
        ShowHideTextView showHideTextView;
        BigDecimal expandNum;
        TextView textView;
        String strM85570i;
        TextView textView2;
        ShowHideTextView showHideTextView2;
        BigDecimal expandNum2;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        Integer numValueOf = null;
        numValueOf = null;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(entity != null ? entity.getCurrency() : null));
        C42487a c42487a = this.f54978c;
        if (c42487a != null && (showHideTextView4 = c42487a.f94143d) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C37885i.m85571j(C27039d.m66647g(entity != null ? entity.getTotalAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null, null, true, false, false, false, null, 122, null));
            sb2.append(' ');
            sb2.append(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null));
            showHideTextView4.setText(sb2.toString());
        }
        C42487a c42487a2 = this.f54978c;
        if (c42487a2 != null && (showHideTextView3 = c42487a2.f94146g) != null) {
            showHideTextView3.setText(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(entity != null ? entity.getTotalAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, null, 0, false, false, false, false, 127, null));
        }
        int i11 = this.f54977b;
        if (i11 == 1) {
            C42487a c42487a3 = this.f54978c;
            if (c42487a3 != null && (textView = c42487a3.f94144e) != null) {
                textView.setText("");
            }
            C42487a c42487a4 = this.f54978c;
            if (c42487a4 == null || (showHideTextView = c42487a4.f94148i) == null) {
                return;
            }
            C27017c c27017c = C27017c.f54310a;
            int i12 = R$string.people_stub;
            if (entity != null && (expandNum = entity.getExpandNum()) != null) {
                numValueOf = Integer.valueOf(expandNum.intValue());
            }
            showHideTextView.setText(c27017c.m66516f(i12, Integer.valueOf(C27039d.m66650j(numValueOf))));
            return;
        }
        if (i11 != 2) {
            return;
        }
        if (entity == null || (expandNum2 = entity.getExpandNum()) == null) {
            strM85570i = "--";
        } else {
            strM85570i = C37885i.m85570i(expandNum2, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null, (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : true, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null);
            if (strM85570i == null) {
                strM85570i = "--";
            }
        }
        C42487a c42487a5 = this.f54978c;
        if (c42487a5 != null && (showHideTextView2 = c42487a5.f94148i) != null) {
            showHideTextView2.setText(strM85570i);
        }
        C42487a c42487a6 = this.f54978c;
        if (c42487a6 == null || (textView2 = c42487a6.f94144e) == null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(' ');
        sb3.append(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null));
        textView2.setText(sb3.toString());
    }
}
