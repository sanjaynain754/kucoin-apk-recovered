package d00;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentBlackGroupResponse;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayPayload;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayRequest;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentNativeFilePickerResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentProtocolUrls;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentRecurringFrequencyInfo;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.p */
/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jw\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00162\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019Ja\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b\"\u0010#JO\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b%\u0010&JO\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b(\u0010&JG\u0010)\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b)\u0010#JG\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b*\u0010#JO\u0010+\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b+\u0010&Jw\u00102\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\b2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b2\u00103JO\u00105\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b5\u0010&JO\u00107\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b7\u0010&JG\u00108\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b8\u0010#JY\u0010;\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b;\u0010<JQ\u0010@\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b@\u0010AJk\u0010E\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\b2\"\u0010\u0013\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bE\u0010FJW\u0010I\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bI\u0010JJW\u0010K\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bK\u0010JJa\u0010M\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010=2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bM\u0010NJO\u0010P\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bP\u0010&JG\u0010R\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010Q\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bR\u0010#JG\u0010S\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bS\u0010#JG\u0010T\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bT\u0010#JG\u0010V\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010U\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\bV\u0010#¨\u0006W"}, m90084d2 = {"Ld00/p;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "", "update", "frequency", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "F", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "allowedCardNetworks", "M", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "isRecurring", "K", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayRequest;", "request", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayPayload;", "m", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayRequest;Lkotlin/jvm/functions/Function2;)V", "t", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "bizType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "data", "N", "g", "n", "u", "orderId", "from", "fromName", TypedValues.TransitionType.S_TO, "toName", "canChat", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "orderJson", "q", "imageUri", "d", "k", "url", "title", "C", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "type", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFilePickerResult;", "o", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "pathList", "businessType", "isPdf", "f", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "isRemoteUrl", "fileUrl", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_SS, C33757kf.f70665k, "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "balanceCurrency", "c", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentBlackGroupResponse;", "O", "B", "y", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentProtocolUrls;", "D", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36581p {
    /* JADX INFO: renamed from: A */
    void mo49469A(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String bizType, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: B */
    void mo49470B(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: C */
    void mo49471C(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @Nullable String title, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: D */
    void mo49472D(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiPaymentProtocolUrls, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: F */
    void mo49473F(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean update, @NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull Function2<? super KCJSApiPaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: K */
    void mo49474K(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable List<String> allowedCardNetworks, @Nullable Boolean isRecurring, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: M */
    void mo49475M(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable List<String> allowedCardNetworks, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: N */
    void mo49476N(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: O */
    void mo49477O(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiPaymentBlackGroupResponse, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo49478b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean isRemoteUrl, @NotNull String fileUrl, @Nullable Long quality, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo49479c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String balanceCurrency, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo49480d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String imageUri, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo49481f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> pathList, @NotNull String businessType, boolean isPdf, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo49482g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo49483h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean isRemoteUrl, @NotNull String fileUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo49485k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo49486l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String orderId, @NotNull String from, @NotNull String fromName, @NotNull String to2, @NotNull String toName, boolean canChat, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: m */
    void mo49487m(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiPaymentFastTradeGooglePayRequest request, @NotNull Function2<? super KCJSApiPaymentFastTradeGooglePayPayload, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: n */
    void mo49488n(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: o */
    void mo49490o(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Long type, @NotNull Function2<? super KCJSApiPaymentNativeFilePickerResult, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: q */
    void mo49491q(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String orderJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: s */
    void mo49492s(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean isRemoteUrl, @NotNull String fileUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: t */
    void mo49493t(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: u */
    void mo49494u(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String bizType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: y */
    void mo49495y(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
