package p258fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$mipmap;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.otc.entity.OtcAd;
import com.kubi.resources.C22890g;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.entity.ShareReferralEntity;
import com.kubi.utils.C27060l0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.AbstractC44173c;
import rs.C44172b;
import w10.C45696a;

/* JADX INFO: renamed from: fb.c */
/* JADX INFO: compiled from: OptionPositionShareUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2 \b\u0002\u0010\n\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0011H\u0002J\"\u0010\u0015\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u001c\u0010\u001a\u001a\u00020\u0013*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/options/positions/share/OptionPositionShareUtils;", "", "<init>", "()V", "doShare", "", "ctx", "Landroid/content/Context;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/entity/OptionsPositionEntity;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getRateTextColor", "", "rate", "Ljava/math/BigDecimal;", "createBitmapByOption", "Landroid/graphics/Bitmap;", "getBackImage", "generateImageByBiz", "layoutId", "initListener", "Lio/reactivex/functions/Consumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "viewToBitmapUnDisplay", "Landroid/view/View;", "width", "height", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOptionPositionShareUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionPositionShareUtils.kt\ncom/kubi/assets/options/positions/share/OptionPositionShareUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class C37421c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37421c f83015a = new C37421c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m84174f(C37421c c37421c, Context context, OptionsPositionEntity optionsPositionEntity, Function2 function2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        c37421c.m84177e(context, optionsPositionEntity, function2);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m84175g(Function2 function2, boolean z11) {
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z11), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m84176c(final Context context, final OptionsPositionEntity optionsPositionEntity) {
        return m84178h(context, R$layout.share_option_position_image, new Consumer() { // from class: fb.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C37421c.m84173d(optionsPositionEntity, context, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m84177e(@NotNull Context ctx, @NotNull OptionsPositionEntity entity, @Nullable final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(entity, "entity");
        try {
            Result.Companion companion = Result.INSTANCE;
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam("op_p_share", null, false, null, false, null, null, null, null, null, 1022, null);
            imageShareParam.setNeedQrCode(false);
            imageShareParam.setBitmap(f83015a.m84176c(ctx, entity));
            iShareService.mo40f(imageShareParam, new Function1() { // from class: fb.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C37421c.m84175g(function2, ((Boolean) obj).booleanValue());
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null || function2 == null) {
            return;
        }
        function2.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
    }

    /* JADX INFO: renamed from: i */
    public final int m84179i(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(new BigDecimal("0.3")) >= 0) {
            return R$mipmap.ic_share_back_two;
        }
        return (bigDecimal.compareTo(BigDecimal.ZERO) < 0 || bigDecimal.compareTo(new BigDecimal("0.3")) >= 0) ? R$mipmap.ic_share_back_three : R$mipmap.ic_share_back_one;
    }

    /* JADX INFO: renamed from: k */
    public final Bitmap m84181k(View view, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static final void m84173d(OptionsPositionEntity optionsPositionEntity, Context context, BaseViewHolder baseViewHolder) {
        String strM89937k;
        String strM85563b;
        String strM85563b2;
        BigDecimal currentProfitLossRate = optionsPositionEntity.getCurrentProfitLossRate();
        if (currentProfitLossRate == null) {
            currentProfitLossRate = BigDecimal.ZERO;
        }
        int i11 = R$id.image;
        C37421c c37421c = f83015a;
        Intrinsics.checkNotNull(currentProfitLossRate);
        baseViewHolder.setImageResource(i11, c37421c.m84179i(currentProfitLossRate));
        baseViewHolder.setText(R$id.symbol, optionsPositionEntity.getProductName());
        int iM84180j = c37421c.m84180j(context, optionsPositionEntity.getCurrentProfitLossRate());
        TextView textView = (TextView) baseViewHolder.getView(R$id.percent);
        textView.setTextColor(iM84180j);
        Intrinsics.checkNotNull(textView);
        String referralCode = null;
        C44172b.m97383c(textView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BigDecimal currentProfitLossRate2 = optionsPositionEntity.getCurrentProfitLossRate();
        if (currentProfitLossRate2 != null) {
            strM89937k = C41014a.m89937k(currentProfitLossRate2, null, 0, false, false, false, 31, null);
        } else {
            strM89937k = null;
        }
        textView.setText(C27041f.m66669i(strM89937k, "--"));
        BigDecimal avgPrice = optionsPositionEntity.getAvgPrice();
        if (avgPrice != null) {
            strM85563b = C37885i.m85563b(avgPrice, C38184b.f85884a.m86146a(), 0, 2, null);
        } else {
            strM85563b = null;
        }
        String strM66669i = C27041f.m66669i(strM85563b, "--");
        C38184b c38184b = C38184b.f85884a;
        baseViewHolder.setText(R$id.avgPriceValue, C42828b.m93906g(strM66669i, c38184b.m86146a(), true, false, 4, null));
        BigDecimal indexPrice = optionsPositionEntity.getIndexPrice();
        if (indexPrice != null) {
            strM85563b2 = C37885i.m85563b(indexPrice, c38184b.m86146a(), 0, 2, null);
        } else {
            strM85563b2 = null;
        }
        baseViewHolder.setText(R$id.exitPriceValue, C42828b.m93906g(C27041f.m66669i(strM85563b2, "--"), c38184b.m86146a(), true, false, 4, null));
        int i12 = R$id.footDesc;
        int i13 = R$string.share_rcode;
        ShareReferralEntity shareReferralEntityM100871a = C45696a.m100871a();
        if (shareReferralEntityM100871a != null) {
            referralCode = shareReferralEntityM100871a.getReferralCode();
        }
        if (referralCode == null) {
            referralCode = "";
        }
        baseViewHolder.setText(i12, context.getString(i13, referralCode));
        baseViewHolder.setImageBitmap(R$id.ivCode, C27060l0.m66759b(IShareService.f49268a.get().mo38d("op_p_share"), C5275i0.m6236a(100.0f)));
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m84178h(Context context, int i11, Consumer<BaseViewHolder> consumer) throws Exception {
        int iM6180b = C5267e0.m6180b();
        View viewInflate = LayoutInflater.from(context).inflate(i11, (ViewGroup) null, false);
        consumer.accept(new BaseViewHolder(viewInflate));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return m84181k(viewInflate, iM6180b, (int) ((iM6180b / 2) * 3.0f));
    }

    /* JADX INFO: renamed from: j */
    public final int m84180j(Context context, BigDecimal bigDecimal) {
        Double dValueOf;
        if (C41014a.m89917B(bigDecimal)) {
            return C27046k.m66699n(context, R$color.c_40_f3f3f3);
        }
        if (bigDecimal != null) {
            dValueOf = Double.valueOf(bigDecimal.doubleValue());
        } else {
            dValueOf = null;
        }
        return C22890g.m54279d(context, C27039d.m66646f(dValueOf), 0, 2, null);
    }
}
