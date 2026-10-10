package com.kubi.futures.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.share.BasePositionShare;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.C22890g;
import com.kubi.sdk.BaseFragment;
import com.kubi.share.api.CustomDisplay;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27060l0;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.TimeZone;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BasePositionShare.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H$¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0004J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/share/BasePositionShare;", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "<init>", "()V", "buildShareParam", "Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "t", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "doShare", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "param", "navigationModifyDisplayShare", "createBitmap", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "ShareParam", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasePositionShare<T, P> {

    /* JADX INFO: compiled from: BasePositionShare.kt */
    @Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0003J\u0006\u00107\u001a\u000202J\b\u00108\u001a\u0004\u0018\u000102J\b\u00109\u001a\u0004\u0018\u00010\u0005J\b\u0010:\u001a\u0004\u0018\u00010\u0005J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\u0005J\u0006\u0010?\u001a\u00020@J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020<J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020<R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010*R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010*R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0018\"\u0004\b-\u0010*R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u00100¨\u0006K"}, m90084d2 = {"Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "Landroid/os/Parcelable;", "isPnl", "", "symbol", "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "side", "leverage", "Ljava/math/BigDecimal;", "pnl", "roi", "time", "", "openPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "settleCurrency", "showUserInfo", "showPnl", "isTrial", "prizeType", "<init>", "(ZLjava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZZLjava/lang/String;)V", "()Z", "getSymbol", "()Ljava/lang/String;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getSide", "getLeverage", "()Ljava/math/BigDecimal;", "getPnl", "getRoi", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpenPrice", "getLatestPrice", "getSettleCurrency", "getShowUserInfo", "setShowUserInfo", "(Z)V", "getShowPnl", "setShowPnl", "setTrial", "getPrizeType", "setPrizeType", "(Ljava/lang/String;)V", "formatTimeDisplay", "", "formatSide", "formatSymbol", "formatLeverage", "hasLeverage", "formatPnl", "formatRoi", "formatOpenPrice", "formatLatestPrice", "getBackgroundRes", "", "getHeadName", "getNickName", "getShareCodeBitmap", "Landroid/graphics/Bitmap;", "formatReferralCode", "Lcom/kubi/utils/StyledText;", "context", "Landroid/content/Context;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ShareParam implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ShareParam> CREATOR = new C13594a();

        @Nullable
        private final ContractEntity contract;
        private final boolean isPnl;
        private boolean isTrial;

        @Nullable
        private final BigDecimal latestPrice;

        @Nullable
        private final BigDecimal leverage;

        @Nullable
        private final BigDecimal openPrice;

        @Nullable
        private final BigDecimal pnl;

        @NotNull
        private String prizeType;

        @Nullable
        private final BigDecimal roi;

        @Nullable
        private final String settleCurrency;
        private boolean showPnl;
        private boolean showUserInfo;

        @NotNull
        private final String side;

        @NotNull
        private final String symbol;

        @Nullable
        private final Long time;

        /* JADX INFO: renamed from: com.kubi.futures.share.BasePositionShare$ShareParam$a */
        /* JADX INFO: compiled from: BasePositionShare.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C13594a implements Parcelable.Creator<ShareParam> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShareParam createFromParcel(Parcel parcel) {
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z12 = true;
                    z11 = true;
                } else {
                    z11 = true;
                }
                String string = parcel.readString();
                ContractEntity contractEntity = (ContractEntity) parcel.readParcelable(ShareParam.class.getClassLoader());
                boolean z13 = z11;
                String string2 = parcel.readString();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
                boolean z14 = z13;
                Long l11 = lValueOf;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z14 = z12;
                }
                if (parcel.readInt() == 0) {
                    z14 = z12;
                }
                if (parcel.readInt() == 0) {
                    z14 = false;
                }
                return new ShareParam(z12, string, contractEntity, string2, bigDecimal, bigDecimal2, bigDecimal3, l11, bigDecimal4, bigDecimal5, string3, z14, z14, z14, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShareParam[] newArray(int i11) {
                return new ShareParam[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ShareParam(boolean z11, @NotNull String symbol, @Nullable ContractEntity contractEntity, @NotNull String side, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Long l11, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str, boolean z12, boolean z13, boolean z14, @NotNull String prizeType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(prizeType, "prizeType");
            this.isPnl = z11;
            this.symbol = symbol;
            this.contract = contractEntity;
            this.side = side;
            this.leverage = bigDecimal;
            this.pnl = bigDecimal2;
            this.roi = bigDecimal3;
            this.time = l11;
            this.openPrice = bigDecimal4;
            this.latestPrice = bigDecimal5;
            this.settleCurrency = str;
            this.showUserInfo = z12;
            this.showPnl = z13;
            this.isTrial = z14;
            this.prizeType = prizeType;
        }

        @Nullable
        public final String formatLatestPrice() {
            BigDecimal bigDecimal = this.latestPrice;
            if (bigDecimal != null) {
                return C17054k0.m36543q(bigDecimal, this.contract, RoundingMode.HALF_UP, true, true, false, 16, null);
            }
            return null;
        }

        @NotNull
        public final String formatLeverage() {
            return C17054k0.m36530d(this.leverage, false, 1, null);
        }

        @Nullable
        public final String formatOpenPrice() {
            BigDecimal bigDecimal = this.openPrice;
            if (bigDecimal != null) {
                return C17054k0.m36543q(bigDecimal, this.contract, RoundingMode.HALF_UP, true, true, false, 16, null);
            }
            return null;
        }

        @NotNull
        public final CharSequence formatPnl() {
            BigDecimal bigDecimalM66656p = C27039d.m66656p(this.pnl);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27039d.m66656p(bigDecimalM66656p).compareTo(BigDecimal.ZERO) >= 0 ? "+" : "");
            sb2.append(C42180b.m92640e(bigDecimalM66656p, null, C37567b.m84623m(this.contract), true, true, true, 0, null, 97, null));
            C27096v0 c27096v0M66905e = new C27096v0().m66905e(C42828b.m93906g(C42828b.m93902c(sb2.toString()), C27041f.m66668h(C27041f.m66677q(this.settleCurrency)), true, false, 4, null), C22890g.m54280e(C27017c.f54310a.m66513b(), bigDecimalM66656p, R$color.c_40_f3f3f3));
            Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
            return c27096v0M66905e;
        }

        @NotNull
        public final C27096v0 formatReferralCode(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String strMo39e = IShareService.f49268a.get().mo39e();
            String string = context.getString(R$string.share_rcode, strMo39e);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C27096v0 c27096v0 = new C27096v0();
            c27096v0.append(string);
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, strMo39e, 0, false, 6, (Object) null);
            if (iIndexOf$default < 0) {
                iIndexOf$default = 0;
            }
            c27096v0.setSpan(new ForegroundColorSpan(context.getResources().getColor(R$color.c_text_white)), iIndexOf$default, string.length(), 33);
            return c27096v0;
        }

        @Nullable
        public final CharSequence formatRoi() {
            BigDecimal bigDecimal = this.roi;
            if (bigDecimal == null) {
                return null;
            }
            return new C27096v0().m66905e(C27041f.m66669i(C42180b.m92642g(bigDecimal, null, null, 0, true, false, true, 23, null), C37569d.m84684y()), C22890g.m54280e(C27017c.f54310a.m66513b(), bigDecimal, R$color.c_40_f3f3f3));
        }

        @NotNull
        public final CharSequence formatSide() {
            C27096v0 c27096v0M66905e = new C27096v0().m66905e(Intrinsics.areEqual(this.side, "buy") ? C27017c.f54310a.m66516f(R$string.multi, new Object[0]) : C27017c.f54310a.m66516f(R$string.empty, new Object[0]), C22890g.m54281f(C27017c.f54310a.m66513b(), Intrinsics.areEqual(this.side, "buy")));
            Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
            return c27096v0M66905e;
        }

        @NotNull
        public final CharSequence formatSymbol() {
            C27096v0 c27096v0M24440e;
            ContractEntity contractEntity = this.contract;
            return (contractEntity == null || (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntity)) == null) ? this.symbol : c27096v0M24440e;
        }

        public final int getBackgroundRes() {
            if (C27039d.m66656p(this.roi).compareTo(new BigDecimal(0.3d)) >= 0) {
                return R$mipmap.ic_share_back_two;
            }
            return (C27039d.m66656p(this.roi).compareTo(BigDecimal.ZERO) < 0 || C27039d.m66656p(this.roi).compareTo(new BigDecimal(0.3d)) >= 0) ? R$mipmap.ic_share_back_three : R$mipmap.ic_share_back_one;
        }

        @Nullable
        public final ContractEntity getContract() {
            return this.contract;
        }

        @NotNull
        public final String getHeadName() {
            return StringsKt.trim((CharSequence) KuMexDepend.f30378a.m35905g().d0().getShowHeadText()).toString();
        }

        @Nullable
        public final BigDecimal getLatestPrice() {
            return this.latestPrice;
        }

        @Nullable
        public final BigDecimal getLeverage() {
            return this.leverage;
        }

        @NotNull
        public final String getNickName() {
            return C27041f.m66669i(KuMexDepend.f30378a.m35905g().d0().getNicknameShow(), C37569d.m84684y());
        }

        @Nullable
        public final BigDecimal getOpenPrice() {
            return this.openPrice;
        }

        @Nullable
        public final BigDecimal getPnl() {
            return this.pnl;
        }

        @NotNull
        public final String getPrizeType() {
            return this.prizeType;
        }

        @Nullable
        public final BigDecimal getRoi() {
            return this.roi;
        }

        @Nullable
        public final String getSettleCurrency() {
            return this.settleCurrency;
        }

        @NotNull
        public final Bitmap getShareCodeBitmap() {
            Bitmap bitmapM66759b = C27060l0.m66759b(IShareService.f49268a.get().mo38d("f_p_share"), C5275i0.m6236a(200.0f));
            Intrinsics.checkNotNullExpressionValue(bitmapM66759b, "createQRCode(...)");
            return bitmapM66759b;
        }

        public final boolean getShowPnl() {
            return this.showPnl;
        }

        public final boolean getShowUserInfo() {
            return this.showUserInfo;
        }

        @NotNull
        public final String getSide() {
            return this.side;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final Long getTime() {
            return this.time;
        }

        public final boolean hasLeverage() {
            return this.leverage != null;
        }

        /* JADX INFO: renamed from: isPnl, reason: from getter */
        public final boolean getIsPnl() {
            return this.isPnl;
        }

        /* JADX INFO: renamed from: isTrial, reason: from getter */
        public final boolean getIsTrial() {
            return this.isTrial;
        }

        public final void setPrizeType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.prizeType = str;
        }

        public final void setShowPnl(boolean z11) {
            this.showPnl = z11;
        }

        public final void setShowUserInfo(boolean z11) {
            this.showUserInfo = z11;
        }

        public final void setTrial(boolean z11) {
            this.isTrial = z11;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isPnl ? 1 : 0);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.contract, flags);
            dest.writeString(this.side);
            dest.writeSerializable(this.leverage);
            dest.writeSerializable(this.pnl);
            dest.writeSerializable(this.roi);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeSerializable(this.openPrice);
            dest.writeSerializable(this.latestPrice);
            dest.writeString(this.settleCurrency);
            dest.writeInt(this.showUserInfo ? 1 : 0);
            dest.writeInt(this.showPnl ? 1 : 0);
            dest.writeInt(this.isTrial ? 1 : 0);
            dest.writeString(this.prizeType);
        }

        @NotNull
        public final CharSequence formatTimeDisplay() {
            String str;
            int rawOffset = ((TimeZone.getDefault().getRawOffset() / 1000) / 60) / 60;
            StringBuilder sb2 = new StringBuilder();
            if (rawOffset >= 0) {
                str = "+";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(rawOffset);
            return C42179a.m92633f(C27039d.m66653m(this.time, System.currentTimeMillis()), null, false, false, null, 15, null) + " (UTC" + sb2.toString() + ')';
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m26501e(BasePositionShare basePositionShare, BaseFragment baseFragment, ShareParam shareParam, AppCompatTextView textView, DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismissAllowingStateLoss();
        basePositionShare.m26505f(baseFragment, shareParam);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m26502g(BaseFragment baseFragment, BasePositionShare basePositionShare, String requestKey, Bundle result) {
        ShareParam shareParam;
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(requestKey, ModifyDisplayShareDialog.f23594s0.getKey()) || (shareParam = (ShareParam) result.getParcelable("data")) == null || !baseFragment.isAdded() || baseFragment.isDetached() || baseFragment.isRemoving()) {
            return;
        }
        basePositionShare.m26504d(baseFragment, shareParam);
    }

    /* JADX INFO: renamed from: d */
    public final void m26504d(@NotNull final BaseFragment fragment, @NotNull final ShareParam param) {
        Bitmap bitmapM26503c;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(param, "param");
        Context context = fragment.getContext();
        if (context == null || (bitmapM26503c = m26503c(context, param)) == null) {
            return;
        }
        IShareService.Companion companion = IShareService.f49268a;
        IShareService.m59640c(companion.get(), new ImageShareParam("f_p_share", bitmapM26503c, false, companion.get().mo38d("f_p_share"), false, null, new CustomDisplay(true, new Function2() { // from class: gi.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BasePositionShare.m26501e(this.f85325b, fragment, param, (AppCompatTextView) obj, (DialogFragment) obj2);
            }
        }), null, null, null, 944, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m26503c(Context context, ShareParam shareParam) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        int iM6180b = C5267e0.m6180b() - C27029c.m66599b(context, 48);
        int i12 = (int) ((iM6180b * 1686) / 1125.0f);
        boolean z16 = false;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.bkumex_fragment_share_image_new, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R$id.symbol)).setText(shareParam.formatSymbol());
        ((TextView) viewInflate.findViewById(R$id.side)).setText(shareParam.formatSide());
        TextView textView = (TextView) viewInflate.findViewById(R$id.leverage);
        textView.setText(shareParam.formatLeverage());
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.pnl);
        textView2.setText(shareParam.formatPnl());
        ((TextView) viewInflate.findViewById(R$id.tv_time)).setText(shareParam.formatTimeDisplay());
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.percent);
        textView3.setText(shareParam.formatRoi());
        Intrinsics.checkNotNull(textView3);
        CharSequence roi = shareParam.formatRoi();
        if (roi != null && roi.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C27046k.m66684G(textView3, !z11);
        TextView textView4 = (TextView) viewInflate.findViewById(R$id.openPrice);
        textView4.setText(C27041f.m66668h(shareParam.formatOpenPrice()));
        Intrinsics.checkNotNull(textView4);
        String openPrice = shareParam.formatOpenPrice();
        if (openPrice != null && openPrice.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        C27046k.m66684G(textView4, !z12);
        TextView textView5 = (TextView) viewInflate.findViewById(R$id.openPriceLabel);
        textView5.setText(context.getString(R$string.kumex_pnl_avg_open_price));
        Intrinsics.checkNotNull(textView5);
        String openPrice2 = shareParam.formatOpenPrice();
        if (openPrice2 != null && openPrice2.length() != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        C27046k.m66684G(textView5, !z13);
        int i13 = R$id.markPrice;
        TextView textView6 = (TextView) viewInflate.findViewById(i13);
        textView6.setText(C27041f.m66668h(shareParam.formatLatestPrice()));
        Intrinsics.checkNotNull(textView6);
        String latestPrice = shareParam.formatLatestPrice();
        if (latestPrice != null && latestPrice.length() != 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        C27046k.m66684G(textView6, !z14);
        TextView textView7 = (TextView) viewInflate.findViewById(R$id.markPriceLabel);
        if (shareParam.getIsPnl()) {
            i11 = R$string.kumex_pnl_avg_close_price;
        } else {
            i11 = R$string.last_price;
        }
        textView7.setText(context.getString(i11));
        Intrinsics.checkNotNull(textView7);
        String latestPrice2 = shareParam.formatLatestPrice();
        if (latestPrice2 != null && latestPrice2.length() != 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        C27046k.m66684G(textView7, !z15);
        ((TextView) viewInflate.findViewById(i13)).setText(shareParam.formatLatestPrice());
        ((ImageView) viewInflate.findViewById(R$id.image)).setBackgroundResource(shareParam.getBackgroundRes());
        ((TextView) viewInflate.findViewById(R$id.tv_head)).setText(shareParam.getHeadName());
        ((TextView) viewInflate.findViewById(R$id.tv_nickName)).setText(shareParam.getNickName());
        TextView textView8 = (TextView) viewInflate.findViewById(R$id.tv_vip);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("VIP Lv.%s", Arrays.copyOf(new Object[]{Integer.valueOf(UserInfo.c().getFeeLevel())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView8.setText(str);
        ((TextView) viewInflate.findViewById(R$id.referralCode)).setText(shareParam.formatReferralCode(context));
        ((ImageView) viewInflate.findViewById(R$id.share_code)).setImageBitmap(shareParam.getShareCodeBitmap());
        if (!shareParam.getIsPnl() || shareParam.hasLeverage()) {
            z16 = true;
        }
        Intrinsics.checkNotNull(textView);
        C27046k.m66684G(textView, z16);
        View viewFindViewById = viewInflate.findViewById(R$id.line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66684G(viewFindViewById, z16);
        View viewFindViewById2 = viewInflate.findViewById(R$id.userInfo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66684G(viewFindViewById2, shareParam.getShowUserInfo());
        Intrinsics.checkNotNull(textView2);
        C27046k.m66684G(textView2, shareParam.getShowPnl());
        View viewFindViewById3 = viewInflate.findViewById(R$id.line1);
        TextView textView9 = (TextView) viewInflate.findViewById(R$id.label);
        Intrinsics.checkNotNull(textView9);
        C27046k.m66684G(textView9, shareParam.getIsTrial());
        Intrinsics.checkNotNull(viewFindViewById3);
        C27046k.m66684G(viewFindViewById3, shareParam.getIsTrial());
        if (shareParam.getIsTrial()) {
            textView9.setText(C27092t0.m66896a(shareParam.getPrizeType()));
        }
        Intrinsics.checkNotNull(viewInflate);
        return ViewExKt.m36491q(viewInflate, iM6180b, i12);
    }

    /* JADX INFO: renamed from: f */
    public final void m26505f(final BaseFragment baseFragment, ShareParam shareParam) {
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        ModifyDisplayShareDialog.Companion companion = ModifyDisplayShareDialog.f23594s0;
        childFragmentManager.setFragmentResultListener(companion.getKey(), baseFragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: gi.b
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                BasePositionShare.m26502g(baseFragment, this, str, bundle);
            }
        });
        FragmentManager childFragmentManager2 = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        companion.show(childFragmentManager2, shareParam);
    }
}
