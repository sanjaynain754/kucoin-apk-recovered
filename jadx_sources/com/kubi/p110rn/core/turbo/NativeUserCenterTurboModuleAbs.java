package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeUserCenterTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J0\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0010\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0016J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\rJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0010H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010&\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0017\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010)J\u001f\u0010*\u001a\u00020+\"\b\b\u0000\u0010,*\u00020-2\b\u0010.\u001a\u0004\u0018\u0001H,¢\u0006\u0002\u0010/¨\u00061"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getUserInfo", "Lcom/kubi/rn/core/turbo/UserInfo;", "persistUserData", "", "userInfoJson", "(Ljava/lang/String;)Ljava/lang/Boolean;", "removeAccounts", "ids", "", "(Ljava/util/List;)Ljava/lang/Boolean;", "logoutAccounts", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "setActiveAccount", "targetid", "extraParams", "Lcom/facebook/react/bridge/ReadableMap;", "getAlternativeAccounts", "gotoCheckLoginPage", "spmId", "getAccountInfoById", "id", "supportDeactivateAccount", "()Ljava/lang/Boolean;", "fetchTermId", "termCode", "fetchTermInfo", "Lcom/kubi/rn/core/turbo/TermInfo;", "getReferralCode", "openChooseResidence", "handleChooseResidenceCallback", ReportDataTable.COLUMN_PARAMS, "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeUserCenterTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "UserCenter";

    @Nullable
    public String fetchTermId(@Nullable String termCode) {
        return null;
    }

    @Nullable
    public List<TermInfo> fetchTermInfo() {
        return null;
    }

    @Nullable
    public List<UserInfo> getAlternativeAccounts() {
        return null;
    }

    @Nullable
    public String getReferralCode() {
        return null;
    }

    @Nullable
    public UserInfo getUserInfo() {
        return null;
    }

    @Nullable
    public Boolean gotoCheckLoginPage(@Nullable String spmId) {
        return null;
    }

    @Nullable
    public Boolean supportDeactivateAccount() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeUserCenterTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public UserInfo getAccountInfoById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "UserCenter";
    }

    @Nullable
    public Boolean handleChooseResidenceCallback(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return null;
    }

    public void logoutAccounts(@NotNull List<String> ids, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openChooseResidence(@Nullable ReadableMap extraParams, @NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean persistUserData(@NotNull String userInfoJson) {
        Intrinsics.checkNotNullParameter(userInfoJson, "userInfoJson");
        return null;
    }

    @Nullable
    public Boolean removeAccounts(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return null;
    }

    public void setActiveAccount(@NotNull String targetid, @Nullable ReadableMap extraParams, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(targetid, "targetid");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
