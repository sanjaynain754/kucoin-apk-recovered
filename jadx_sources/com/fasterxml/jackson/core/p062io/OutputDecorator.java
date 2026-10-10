package com.fasterxml.jackson.core.p062io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes45.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(C6310d c6310d, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(C6310d c6310d, Writer writer) throws IOException;
}
