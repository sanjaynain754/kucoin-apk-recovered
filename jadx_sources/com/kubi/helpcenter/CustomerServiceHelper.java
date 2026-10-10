package com.kubi.helpcenter;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.entity.ParcelableMapEntity;
import com.kubi.helpcenter.p085ui.AdaBotChatFragment;
import com.kubi.kucoin.data.platform.IPAddressHelper;
import com.kubi.mine.api.service.IMineService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015aj.C0374a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CustomerServiceHelper.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/helpcenter/CustomerServiceHelper;", "", "<init>", "()V", "Companion", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomerServiceHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25162a = new Companion(null);

    /* JADX INFO: compiled from: CustomerServiceHelper.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\nJ\\\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012JN\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/helpcenter/CustomerServiceHelper$Companion;", "", "<init>", "()V", "generateMetas", "", "", "from", "configMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "toChatDirectly", "", "context", "Landroid/content/Context;", "source", "Lcom/kubi/helpcenter/api/CustomerServiceType;", "isReset", "", "invokeAdaBotSdk", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCustomerServiceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,152:1\n216#2,2:153\n*S KotlinDebug\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion\n*L\n68#1:153,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void toChatDirectly$default(Companion companion, Context context, String str, CustomerServiceType customerServiceType, HashMap map, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i11 & 4) != 0) {
                customerServiceType = CustomerServiceType.NONE;
            }
            CustomerServiceType customerServiceType2 = customerServiceType;
            if ((i11 & 8) != 0) {
                map = null;
            }
            HashMap map2 = map;
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            companion.toChatDirectly(context, str2, customerServiceType2, map2, z11);
        }

        /* JADX INFO: renamed from: b */
        public final void m28890b(Context context, final String str, final HashMap<String, String> map, boolean z11) {
            if (Build.VERSION.SDK_INT <= 28) {
                UserLabelManager.f25240a.m28895d(new Function0() { // from class: com.kubi.helpcenter.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CustomerServiceHelper.Companion.m28889c(str, map);
                    }
                });
                return;
            }
            String string = context.getString(R$string.online_support);
            String name = AdaBotChatFragment.class.getName();
            Bundle bundle = new Bundle();
            bundle.putString("data", C27041f.m66668h(str));
            bundle.putBoolean("isReset", z11);
            bundle.putParcelable("ada_config", new ParcelableMapEntity(map));
            Unit unit = Unit.INSTANCE;
            BaseFragmentActivity.m56574n0(context, string, name, bundle);
        }

        @NotNull
        public final Map<String, String> generateMetas(@NotNull String from, @Nullable HashMap<String, String> configMap) {
            String strMo41620c;
            Intrinsics.checkNotNullParameter(from, "from");
            HashMap map = new HashMap();
            String strM28896f = UserLabelManager.f25240a.m28896f();
            if (strM28896f != null) {
                map.put("userLabel", strM28896f);
            }
            map.put("time-zone", String.valueOf(TimeZone.getDefault().getRawOffset() - TimeZone.getTimeZone("Asia/Shanghai").getRawOffset()));
            C0374a c0374a = C0374a.f1118a;
            if (c0374a.m1469a()) {
                LoginUserEntity loginUserEntityC = UserInfo.c();
                String str = loginUserEntityC.uid;
                if (str == null) {
                    str = "";
                }
                map.put("UID", str);
                map.put("PhoneValidate", String.valueOf(loginUserEntityC.isPhoneValidate()));
                String nicknameR = loginUserEntityC.getNicknameR();
                if (nicknameR == null) {
                    nicknameR = "";
                }
                map.put("Nickname", nicknameR);
                map.put("EmailValidate", String.valueOf(loginUserEntityC.isEmailValidate()));
            }
            IMineService iMineServiceM1470b = c0374a.m1470b();
            if (iMineServiceM1470b == null || (strMo41620c = iMineServiceM1470b.mo41620c(IPAddressHelper.f27740a.m32049c())) == null) {
                strMo41620c = "";
            }
            map.put("visit_note", strMo41620c);
            if (from.length() > 0) {
                map.put("source", from);
            }
            if (C27025c.m66566d(configMap != null ? Boolean.valueOf(!configMap.isEmpty()) : null) && configMap != null) {
                for (Map.Entry<String, String> entry : configMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    map.put(key, value);
                }
            }
            return map;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m28889c(String str, HashMap map) {
            Router.f46192a.m56184f("https://kucoin.eu.ada.support/chat").m4038a("ua", StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(CustomerServiceHelper.f25162a.generateMetas(C27041f.m66668h(str), map).toString(), "\r", ",", false, 4, (Object) null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, ",", false, 4, (Object) null), "null", "", false, 4, (Object) null)).m4048k();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Map generateMetas$default(Companion companion, String str, HashMap map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.generateMetas(str, map);
        }

        public final void toChatDirectly(@NotNull Context context, @Nullable String from, @NotNull CustomerServiceType source, @Nullable HashMap<String, String> configMap, boolean isReset) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(source, "source");
            MviExKt.m42518n(new CustomerServiceHelper$Companion$toChatDirectly$1(source, from, context, configMap, isReset, null));
        }
    }
}
