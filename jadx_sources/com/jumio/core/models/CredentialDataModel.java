package com.jumio.core.models;

import androidx.annotation.VisibleForTesting;
import com.jumio.commons.PersistWith;
import com.jumio.core.Controller;
import com.jumio.core.credentials.RequiredPart;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import jumio.core.C40512C0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 -2\u00020\u0001:\u0001-B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0010¢\u0006\u0002\b,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006."}, m90084d2 = {"Lcom/jumio/core/models/CredentialDataModel;", "Lcom/jumio/core/model/StaticModel;", "id", "", "category", "Lcom/jumio/sdk/credentials/JumioCredentialCategory;", "capabilities", "", "Lcom/jumio/core/credentials/CredentialCapability;", "requiredParts", "Lcom/jumio/core/credentials/RequiredPart;", "executionOrder", "", "<init>", "(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;I)V", "(Lcom/jumio/sdk/credentials/JumioCredentialCategory;)V", "getId", "()Ljava/lang/String;", "getCategory", "()Lcom/jumio/sdk/credentials/JumioCredentialCategory;", "getCapabilities", "()Ljava/util/List;", "getRequiredParts", "getExecutionOrder", "()I", "scanData", "Ljava/util/SortedMap;", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "Lcom/jumio/core/models/ScanPartModel;", "getScanData", "()Ljava/util/SortedMap;", "addonScanData", "getAddonScanData", "isComplete", "", "()Z", "activeCredentialPart", "getActiveCredentialPart", "()Lcom/jumio/sdk/enums/JumioCredentialPart;", "setActiveCredentialPart", "(Lcom/jumio/sdk/enums/JumioCredentialPart;)V", "isNotSupported", "controller", "Lcom/jumio/core/Controller;", "isNotSupported$jumio_core_release", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CredentialsDataModel")
@SourceDebugExtension({"SMAP\nCredentialDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialDataModel.kt\ncom/jumio/core/models/CredentialDataModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,92:1\n168#2,3:93\n*S KotlinDebug\n*F\n+ 1 CredentialDataModel.kt\ncom/jumio/core/models/CredentialDataModel\n*L\n37#1:93,3\n*E\n"})
public class CredentialDataModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final String f14197a;

    /* JADX INFO: renamed from: b */
    public final JumioCredentialCategory f14198b;

    /* JADX INFO: renamed from: c */
    public final List f14199c;

    /* JADX INFO: renamed from: d */
    public final int f14200d;

    /* JADX INFO: renamed from: e */
    public final SortedMap f14201e;

    /* JADX INFO: renamed from: f */
    public final SortedMap f14202f;

    /* JADX INFO: renamed from: g */
    public JumioCredentialPart f14203g;

    public CredentialDataModel(@NotNull String id2, @NotNull JumioCredentialCategory category, @NotNull List<C40512C0> capabilities, @NotNull List<? extends RequiredPart> requiredParts, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requiredParts, "requiredParts");
        this.f14197a = id2;
        this.f14198b = category;
        this.f14199c = capabilities;
        this.f14200d = i11;
        this.f14201e = MapsKt.sortedMapOf(new Pair[0]);
        this.f14202f = MapsKt.sortedMapOf(new Pair[0]);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo14553a(Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return false;
    }

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/models/CredentialDataModel$Companion;", "", "<init>", "()V", "DEFAULT_EXECUTION_ORDER", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo14552a() {
        if (this.f14201e.isEmpty()) {
            return false;
        }
        SortedMap sortedMap = this.f14201e;
        if (sortedMap.isEmpty()) {
            return true;
        }
        Iterator it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!((ScanPartModel) ((Map.Entry) it.next()).getValue()).isComplete()) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ CredentialDataModel(String str, JumioCredentialCategory jumioCredentialCategory, List list, List list2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jumioCredentialCategory, list, list2, (i12 & 16) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public CredentialDataModel(@NotNull JumioCredentialCategory category) {
        this("", category, CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0);
        Intrinsics.checkNotNullParameter(category, "category");
    }
}
