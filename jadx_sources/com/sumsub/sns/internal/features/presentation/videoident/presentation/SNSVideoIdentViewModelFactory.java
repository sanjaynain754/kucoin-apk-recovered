package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import com.sumsub.sns.internal.core.common.InterfaceC28439b1;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.features.domain.C30090Y;
import com.sumsub.sns.internal.features.domain.videoident.C30321b;
import com.sumsub.sns.internal.features.domain.videoident.C30323d;
import com.sumsub.sns.internal.features.domain.videoident.C30325f;
import com.sumsub.sns.internal.features.domain.videoident.C30327h;
import com.sumsub.sns.internal.features.domain.videoident.C30329j;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "", "Lcom/sumsub/sns/internal/features/data/model/common/Document;", "documents", "Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistryOwner", "Lcom/sumsub/sns/internal/core/domain/h;", "serviceLocator", "Landroid/os/Bundle;", "args", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "videoChatAdapter", "Lcom/sumsub/sns/internal/core/common/b1;", "uriContentLoader", "<init>", "(Ljava/util/List;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;)V", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/SavedStateHandle;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Lcom/sumsub/sns/internal/core/domain/h;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "Lcom/sumsub/sns/internal/core/common/b1;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoIdentViewModelFactory extends AbstractSavedStateViewModelFactory {

    @NotNull
    private final List<Document> documents;

    @NotNull
    private final C28578h serviceLocator;

    @NotNull
    private final InterfaceC28439b1 uriContentLoader;

    @NotNull
    private final SNSVideoChatAdapter videoChatAdapter;

    public /* synthetic */ SNSVideoIdentViewModelFactory(List list, SavedStateRegistryOwner savedStateRegistryOwner, C28578h c28578h, Bundle bundle, SNSVideoChatAdapter sNSVideoChatAdapter, InterfaceC28439b1 interfaceC28439b1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, savedStateRegistryOwner, c28578h, (i11 & 8) != 0 ? null : bundle, sNSVideoChatAdapter, interfaceC28439b1);
    }

    public SNSVideoIdentViewModelFactory(@NotNull List<Document> list, @NotNull SavedStateRegistryOwner savedStateRegistryOwner, @NotNull C28578h c28578h, @Nullable Bundle bundle, @NotNull SNSVideoChatAdapter sNSVideoChatAdapter, @NotNull InterfaceC28439b1 interfaceC28439b1) {
        super(savedStateRegistryOwner, bundle);
        this.documents = list;
        this.serviceLocator = c28578h;
        this.videoChatAdapter = sNSVideoChatAdapter;
        this.uriContentLoader = interfaceC28439b1;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
        List<Document> list = this.documents;
        C28578h c28578h = this.serviceLocator;
        return new SNSVideoIdentViewModel(list, c28578h.f58188z, (InterfaceC29953a) c28578h.f58168f.getValue(), (InterfaceC29984m) this.serviceLocator.f58180r.getValue(), (InterfaceC30035a) this.serviceLocator.f58181s.getValue(), handle, new C30327h((C29917M) this.serviceLocator.f58172j.getValue(), (InterfaceC29953a) this.serviceLocator.f58168f.getValue()), new C30329j((C29917M) this.serviceLocator.f58172j.getValue(), (InterfaceC29953a) this.serviceLocator.f58168f.getValue()), new C30325f((InterfaceC29953a) this.serviceLocator.f58168f.getValue(), (C29917M) this.serviceLocator.f58172j.getValue(), (InterfaceC29984m) this.serviceLocator.f58180r.getValue()), new C30323d((InterfaceC29953a) this.serviceLocator.f58168f.getValue(), (C29917M) this.serviceLocator.f58172j.getValue(), (InterfaceC29984m) this.serviceLocator.f58180r.getValue()), new C30321b((C29917M) this.serviceLocator.f58172j.getValue(), (InterfaceC29953a) this.serviceLocator.f58168f.getValue()), new C30090Y((InterfaceC29953a) this.serviceLocator.f58168f.getValue()), this.videoChatAdapter, this.uriContentLoader, (InterfaceC29921d) this.serviceLocator.f58169g.getValue());
    }

    @NotNull
    public final List<Document> getDocuments() {
        return this.documents;
    }
}
