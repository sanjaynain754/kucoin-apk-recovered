package com.kubi.home.newcoin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.RecommendNewCoinEntity;
import com.kubi.home.exception.HomeException;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p419l2.C42032f;
import p569qq.C43846g;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.home.newcoin.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeRecommPosHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u0005*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007¨\u0006!"}, m90084d2 = {"Lcom/kubi/home/newcoin/HomeRecommPosHelper;", "", "<init>", "()V", "loadIcon", "", "Landroid/widget/ImageView;", "url", "", "context", "Landroid/content/Context;", "isCircle", "", "formatOpentime", "", "time", "", "(Ljava/lang/Long;)[Ljava/lang/String;", "formatTextViewPercentData", "Landroid/widget/TextView;", "content", "scale", "", "trackCoin", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/RecommendNewCoinEntity;", "expose", "getContentType", "trackPos", "Lcom/kubi/home/entity/RecommendPositionEntity;", ViewProps.POSITION, "", "trackActivity", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRecommPosHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRecommPosHelper.kt\ncom/kubi/home/newcoin/HomeRecommPosHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,184:1\n1#2:185\n47#3,2:186\n*S KotlinDebug\n*F\n+ 1 HomeRecommPosHelper.kt\ncom/kubi/home/newcoin/HomeRecommPosHelper\n*L\n62#1:186,2\n*E\n"})
public final class HomeRecommPosHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeRecommPosHelper f25930a = new HomeRecommPosHelper();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String[] m29732a(@Nullable Long l11) {
        Object objM103844constructorimpl;
        String strValueOf;
        String strValueOf2;
        String[] strArr = {"0000", "0", "0", "00", "00"};
        try {
            Result.Companion companion = Result.INSTANCE;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(C27039d.m66652l(l11)));
            calendar.add(14, -(calendar.get(15) + calendar.get(16)));
            strArr[0] = String.valueOf(calendar.get(1));
            strArr[1] = String.valueOf(calendar.get(2) + 1);
            strArr[2] = String.valueOf(calendar.get(5));
            int i11 = calendar.get(11);
            if (i11 < 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('0');
                sb2.append(i11);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(i11);
            }
            strArr[3] = strValueOf;
            int i12 = calendar.get(12);
            if (i12 < 10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('0');
                sb3.append(i12);
                strValueOf2 = sb3.toString();
            } else {
                strValueOf2 = String.valueOf(i12);
            }
            strArr[4] = strValueOf2;
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl, "HomeRecommPosHelper", false, null, 8, null), null, 2, null);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m29733c(HomeRecommPosHelper homeRecommPosHelper, TextView textView, String str, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.75f;
        }
        homeRecommPosHelper.m29737b(textView, str, f11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m29734f(HomeRecommPosHelper homeRecommPosHelper, ImageView imageView, String str, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            context = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        homeRecommPosHelper.m29739e(imageView, str, context, z11);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m29735g(@NotNull RecommendNewCoinEntity entity, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("postId", String.valueOf(entity.getRecommendedId()));
            jSONObject.put("postTitle", entity.getCurrency());
            jSONObject.put("contentType", f25930a.m29738d(entity));
            jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
            Unit unit = Unit.INSTANCE;
            C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "coinAd", "1", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("postId", String.valueOf(entity.getRecommendedId()));
        jSONObject2.put("postTitle", entity.getCurrency());
        jSONObject2.put("contentType", f25930a.m29738d(entity));
        jSONObject2.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        Unit unit2 = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "coinAd", "1", jSONObject2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m29736h(@NotNull RecommendNewCoinEntity entity, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("postId", entity.getRecommendedId());
            jSONObject.put("postTitle", entity.getName());
            jSONObject.put("contentType", f25930a.m29738d(entity));
            jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
            String activityContent = entity.getActivityContent();
            jSONObject.put("yesOrNo", !(activityContent == null || activityContent.length() == 0));
            Unit unit = Unit.INSTANCE;
            C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "newCoinRecom", "1", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("postId", entity.getRecommendedId());
        jSONObject2.put("postTitle", entity.getName());
        jSONObject2.put("contentType", f25930a.m29738d(entity));
        jSONObject2.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        String activityContent2 = entity.getActivityContent();
        jSONObject2.put("yesOrNo", !(activityContent2 == null || activityContent2.length() == 0));
        Unit unit2 = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "newCoinRecom", "1", jSONObject2);
    }

    /* JADX INFO: renamed from: b */
    public final void m29737b(@Nullable TextView textView, @NotNull String content, float f11) {
        CharSequence charSequence;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(content, "content");
        if (textView == null) {
            return;
        }
        if (!StringsKt.contains$default((CharSequence) content, '%', false, 2, (Object) null)) {
            textView.setText(content);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SpannableString spannableString = new SpannableString(content);
            float textSize = textView.getTextSize() * f11;
            charSequence = content;
            try {
                int iIndexOf$default = StringsKt.indexOf$default(charSequence, '%', 0, false, 6, (Object) null);
                spannableString.setSpan(new AbsoluteSizeSpan((int) textSize), iIndexOf$default, iIndexOf$default + 1, 0);
                textView.setText(spannableString);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence = content;
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            textView.setText(charSequence);
        }
        Result.m103843boximpl(objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: e */
    public final void m29739e(@Nullable ImageView imageView, @Nullable String str, @Nullable Context context, boolean z11) {
        Object objM103844constructorimpl;
        if (imageView == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (context == null) {
                context = imageView.getContext();
            }
            C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(context).mo6634v(str);
            int i11 = R$mipmap.kucoin_icon_default_icon;
            C46340c<Drawable> c46340cMo92208m = c46340cMo6634v.mo92188b0(i11).mo92208m(i11);
            Intrinsics.checkNotNullExpressionValue(c46340cMo92208m, "error(...)");
            if (z11) {
                c46340cMo92208m = c46340cMo92208m.mo6606a(new C42032f().mo6606a(C42032f.m92236t0()));
                Intrinsics.checkNotNullExpressionValue(c46340cMo92208m, "apply(...)");
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c46340cMo92208m.m6594E0(imageView));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            imageView.setImageResource(R$mipmap.kucoin_icon_default_icon);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m29738d(RecommendNewCoinEntity recommendNewCoinEntity) {
        String type = recommendNewCoinEntity.getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1694901277) {
                if (iHashCode != 2432586) {
                    if (iHashCode == 399798184 && type.equals("PREVIEW")) {
                        return "new_coin_notice";
                    }
                    return "";
                }
                if (type.equals("OPEN")) {
                    return "new_coin_trade";
                }
                return "";
            }
            if (type.equals("HOT_CURRENCY")) {
                return "hot_coin";
            }
            return "";
        }
        return "";
    }
}
