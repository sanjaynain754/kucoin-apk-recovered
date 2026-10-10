package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.Controller;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.credentials.JumioDocumentCredential;
import com.jumio.sdk.credentials.JumioFaceCredential;
import com.jumio.sdk.credentials.JumioIDCredential;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jumio.core.AbstractC40519D2;
import jumio.core.C40522E0;
import jumio.core.C40527F0;
import jumio.core.C40532G0;
import jumio.core.C40537H0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0015J\u0006\u0010 \u001a\u00020\u0011J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J#\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006+"}, m90084d2 = {"Lcom/jumio/core/models/CredentialsModel;", "Lcom/jumio/core/model/StaticModel;", "dataModels", "", "Lcom/jumio/core/models/CredentialDataModel;", "acquisitionMode", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDataModels", "()Ljava/util/List;", "getAcquisitionMode", "()Ljava/lang/String;", "value", "activeCredential", "getActiveCredential", "allScanned", "", "getAllScanned", "()Z", "infos", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "getInfos", "startCredential", "Lcom/jumio/sdk/credentials/JumioCredential;", "controller", "Lcom/jumio/core/Controller;", "id", "finishCredential", "", "validateCredentialOrder", "credentialInfo", "isAcquisitionModeReusableIdentity", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CredentialsModel")
@SourceDebugExtension({"SMAP\nCredentialsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialsModel.kt\ncom/jumio/core/models/CredentialsModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1734#2,3:71\n1557#2:74\n1628#2,3:75\n360#2,7:78\n774#2:86\n865#2,2:87\n1557#2:89\n1628#2,3:90\n2632#2,3:93\n1#3:85\n*S KotlinDebug\n*F\n+ 1 CredentialsModel.kt\ncom/jumio/core/models/CredentialsModel\n*L\n22#1:71,3\n24#1:74\n24#1:75,3\n29#1:78,7\n55#1:86\n55#1:87,2\n56#1:89\n56#1:90,3\n57#1:93,3\n*E\n"})
public final /* data */ class CredentialsModel implements StaticModel {

    /* JADX INFO: renamed from: d */
    public static final Companion f14204d = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final List f14205a;

    /* JADX INFO: renamed from: b */
    public final String f14206b;

    /* JADX INFO: renamed from: c */
    public String f14207c;

    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/models/CredentialsModel$Companion;", "", "<init>", "()V", "ACQUISITION_MODE_REUSABLE_IDENTITY", "", "fromJson", "Lcom/jumio/core/models/CredentialsModel;", "jsonArray", "Lorg/json/JSONArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final CredentialsModel fromJson(@NotNull JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            return new C40537H0().m89172a(jsonArray);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CredentialsModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m14555a() {
        List<CredentialDataModel> list = this.f14205a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (CredentialDataModel credentialDataModel : list) {
            arrayList.add(new JumioCredentialInfo(credentialDataModel.f14198b, credentialDataModel.f14197a, credentialDataModel.f14200d));
        }
        return arrayList;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CredentialsModel)) {
            return false;
        }
        CredentialsModel credentialsModel = (CredentialsModel) other;
        return Intrinsics.areEqual(this.f14205a, credentialsModel.f14205a) && Intrinsics.areEqual(this.f14206b, credentialsModel.f14206b);
    }

    public CredentialsModel(@NotNull List<? extends CredentialDataModel> dataModels, @NotNull String acquisitionMode) {
        Intrinsics.checkNotNullParameter(dataModels, "dataModels");
        Intrinsics.checkNotNullParameter(acquisitionMode, "acquisitionMode");
        this.f14205a = dataModels;
        this.f14206b = acquisitionMode;
    }

    public final int hashCode() {
        return this.f14206b.hashCode() + (this.f14205a.hashCode() * 31);
    }

    public final String toString() {
        return "CredentialsModel(dataModels=" + this.f14205a + ", acquisitionMode=" + this.f14206b + ')';
    }

    public /* synthetic */ CredentialsModel(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: a */
    public final JumioCredential m14554a(Controller controller, String id2) {
        JumioCredential jumioDocumentCredential;
        CredentialDataModel f14676b;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(id2, "id");
        Iterator it = this.f14205a.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.areEqual(((CredentialDataModel) it.next()).f14197a, id2)) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            CredentialDataModel credentialDataModel = (CredentialDataModel) this.f14205a.get(i11);
            String str = null;
            if (credentialDataModel instanceof C40532G0) {
                jumioDocumentCredential = new JumioIDCredential(controller, (C40532G0) credentialDataModel, null, null, 12, null);
            } else if (credentialDataModel instanceof C40527F0) {
                jumioDocumentCredential = new JumioFaceCredential(controller, (C40527F0) credentialDataModel);
            } else {
                jumioDocumentCredential = credentialDataModel instanceof C40522E0 ? new JumioDocumentCredential(controller, (C40522E0) credentialDataModel) : null;
            }
            if (jumioDocumentCredential != null && (f14676b = jumioDocumentCredential.getF14676b()) != null) {
                str = f14676b.f14197a;
            }
            this.f14207c = str;
            return jumioDocumentCredential;
        }
        throw new IllegalArgumentException(AbstractC40519D2.m89156a(id2, " not found").toString());
    }
}
