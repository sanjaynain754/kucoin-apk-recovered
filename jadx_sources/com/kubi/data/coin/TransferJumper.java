package com.kubi.data.coin;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.DataInitManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TransferJumper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated(message = "使用路由协议类KCRouterProtocol")
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/data/coin/TransferJumper;", "", "<init>", "()V", "Companion", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TransferJumper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21427a = new Companion(null);

    /* JADX INFO: compiled from: TransferJumper.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/data/coin/TransferJumper$Companion;", "", "<init>", "()V", "jumpToTransfer", "", FirebaseAnalytics.Param.CURRENCY, "", "fromSymbol", "toSymbol", "from", TypedValues.TransitionType.S_TO, "includeContract", "", "spmId", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void jumpToTransfer$default(Companion companion, String str, String str2, String str3, String str4, String str5, boolean z11, String str6, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                str4 = null;
            }
            if ((i11 & 16) != 0) {
                str5 = null;
            }
            if ((i11 & 32) != 0) {
                z11 = false;
            }
            if ((i11 & 64) != 0) {
                str6 = null;
            }
            companion.jumpToTransfer(str, str2, str3, str4, str5, z11, str6);
        }

        @Deprecated(message = "使用KCRouterProtocol.jumpTransfer()跳转")
        public final void jumpToTransfer(@Nullable String currency, @Nullable String fromSymbol, @Nullable String toSymbol, @Nullable String from, @Nullable String to2, boolean includeContract, @Nullable String spmId) {
            DataInitManager.f21486a.m23668i().mo23679g(currency, fromSymbol, toSymbol, from, to2, includeContract, spmId);
        }
    }
}
