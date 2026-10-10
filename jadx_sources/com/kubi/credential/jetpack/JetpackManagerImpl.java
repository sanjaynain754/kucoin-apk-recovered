package com.kubi.credential.jetpack;

import android.content.Context;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.core.InterfaceC12468a;
import com.kubi.credential.exception.CreateCredentialException;
import com.kubi.credential.exception.GetCredentialException;
import com.kubi.credential.model.CredentialType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p230ef.AbstractC37150a;
import p230ef.AbstractC37151b;
import p230ef.C37158i;
import p230ef.C37159j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JetpackManagerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/credential/jetpack/JetpackManagerImpl;", "Lcom/kubi/credential/core/a;", "Landroid/content/Context;", "context", "", "assetLinks", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lef/a;", "request", "Lef/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lef/i;", "Lef/j;", "b", "(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kubi/credential/model/CredentialType;", "c", "()Ljava/util/List;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/credentials/CredentialManager;", "Lkotlin/Lazy;", "f", "()Landroidx/credentials/CredentialManager;", "manager", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class JetpackManagerImpl implements InterfaceC12468a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String assetLinks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy manager;

    public JetpackManagerImpl(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.assetLinks = str;
        this.manager = LazyKt.lazy(new Function0<CredentialManager>() { // from class: com.kubi.credential.jetpack.JetpackManagerImpl$manager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CredentialManager invoke() {
                return CredentialManager.INSTANCE.create(new C12469a(this.this$0.context, this.this$0.assetLinks));
            }

            {
                super(0);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo23421a(@NotNull Context context, @NotNull AbstractC37150a abstractC37150a, @NotNull Continuation<? super AbstractC37151b> continuation) throws CreateCredentialException, ClassNotFoundException {
        JetpackManagerImpl$createCredential$1 jetpackManagerImpl$createCredential$1;
        if (continuation instanceof JetpackManagerImpl$createCredential$1) {
            jetpackManagerImpl$createCredential$1 = (JetpackManagerImpl$createCredential$1) continuation;
            int i11 = jetpackManagerImpl$createCredential$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jetpackManagerImpl$createCredential$1.label = i11 - Integer.MIN_VALUE;
            } else {
                jetpackManagerImpl$createCredential$1 = new JetpackManagerImpl$createCredential$1(this, continuation);
            }
        } else {
            jetpackManagerImpl$createCredential$1 = new JetpackManagerImpl$createCredential$1(this, continuation);
        }
        Object objCreateCredential = jetpackManagerImpl$createCredential$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jetpackManagerImpl$createCredential$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objCreateCredential);
                CredentialManager credentialManagerM23426f = m23426f();
                CreateCredentialRequest createCredentialRequestM23428a = C12470b.m23428a(abstractC37150a);
                jetpackManagerImpl$createCredential$1.label = 1;
                objCreateCredential = credentialManagerM23426f.createCredential(context, createCredentialRequestM23428a, jetpackManagerImpl$createCredential$1);
                if (objCreateCredential == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateCredential);
            }
            return C12470b.m23432e((CreateCredentialResponse) objCreateCredential);
        } catch (androidx.credentials.exceptions.CreateCredentialException e11) {
            throw C12470b.m23431d(e11);
        } catch (JSONException e12) {
            throw new CreateCredentialException("androidx.credentials.TYPE_CREATE_CREDENTIAL_JSON_EXCEPTION", null, e12, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo23422b(@NotNull Context context, @NotNull C37158i c37158i, @NotNull Continuation<? super C37159j> continuation) throws CreateCredentialException, GetCredentialException {
        JetpackManagerImpl$getCredential$1 jetpackManagerImpl$getCredential$1;
        if (continuation instanceof JetpackManagerImpl$getCredential$1) {
            jetpackManagerImpl$getCredential$1 = (JetpackManagerImpl$getCredential$1) continuation;
            int i11 = jetpackManagerImpl$getCredential$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jetpackManagerImpl$getCredential$1.label = i11 - Integer.MIN_VALUE;
            } else {
                jetpackManagerImpl$getCredential$1 = new JetpackManagerImpl$getCredential$1(this, continuation);
            }
        } else {
            jetpackManagerImpl$getCredential$1 = new JetpackManagerImpl$getCredential$1(this, continuation);
        }
        Object credential = jetpackManagerImpl$getCredential$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jetpackManagerImpl$getCredential$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(credential);
                CredentialManager credentialManagerM23426f = m23426f();
                GetCredentialRequest getCredentialRequestM23430c = C12470b.m23430c(c37158i);
                jetpackManagerImpl$getCredential$1.label = 1;
                credential = credentialManagerM23426f.getCredential(context, getCredentialRequestM23430c, jetpackManagerImpl$getCredential$1);
                if (credential == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(credential);
            }
            return C12470b.m23435h((GetCredentialResponse) credential);
        } catch (androidx.credentials.exceptions.GetCredentialException e11) {
            throw C12470b.m23434g(e11);
        } catch (JSONException e12) {
            throw new CreateCredentialException("android.credentials.GetCredentialException.TYPE_JSON", null, e12, 2, null);
        }
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<CredentialType> mo23423c() {
        return C12471c.f21328a.m23436a(this.context);
    }

    /* JADX INFO: renamed from: f */
    public final CredentialManager m23426f() {
        return (CredentialManager) this.manager.getValue();
    }
}
