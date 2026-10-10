package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes56.dex */
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final Function<String, String> asFunction = new Function() { // from class: com.google.common.escape.a
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f12323b.escape((String) obj);
        }
    };

    public abstract String escape(String str);

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }
}
