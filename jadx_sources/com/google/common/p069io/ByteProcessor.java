package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement it normally")
@J2ktIncompatible
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] bArr, int i11, int i12) throws IOException;
}
