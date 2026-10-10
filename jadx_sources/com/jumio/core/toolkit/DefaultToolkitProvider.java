package com.jumio.core.toolkit;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/toolkit/DefaultToolkitProvider;", "Lcom/jumio/core/toolkit/ToolkitProviderInterface;", "<init>", "()V", "create", "Lcom/jumio/core/toolkit/ToolkitInterface;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultToolkitProvider implements ToolkitProviderInterface {
    @Override // com.jumio.core.toolkit.ToolkitProviderInterface
    @NotNull
    public ToolkitInterface create() {
        return new DefaultToolkit();
    }
}
