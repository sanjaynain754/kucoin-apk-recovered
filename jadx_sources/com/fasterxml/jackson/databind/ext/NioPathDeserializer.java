package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;
import p465n7.C42760b;
import p465n7.C42764f;
import p465n7.C42766h;
import p465n7.C42767i;

/* JADX INFO: loaded from: classes45.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {

    /* JADX INFO: renamed from: b */
    public static final boolean f10363b;
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return C42764f.m93699a(deserializationContext.handleUnexpectedToken(C42760b.m93694a(), jsonParser));
        }
        String strMo10869W = jsonParser.mo10869W();
        if (strMo10869W.indexOf(58) < 0) {
            return Paths.get(strMo10869W, new String[0]);
        }
        if (f10363b && strMo10869W.length() >= 2 && Character.isLetter(strMo10869W.charAt(0)) && strMo10869W.charAt(1) == ':') {
            return Paths.get(strMo10869W, new String[0]);
        }
        try {
            URI uri = new URI(strMo10869W);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e11) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(C42766h.m93701a()).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProviderM93702a = C42767i.m93702a(it.next());
                        if (fileSystemProviderM93702a.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProviderM93702a.getPath(uri);
                        }
                    }
                    return C42764f.m93699a(deserializationContext.handleInstantiationProblem(handledType(), strMo10869W, e11));
                } catch (Throwable th2) {
                    th2.addSuppressed(e11);
                    return C42764f.m93699a(deserializationContext.handleInstantiationProblem(handledType(), strMo10869W, th2));
                }
            } catch (Throwable th3) {
                return C42764f.m93699a(deserializationContext.handleInstantiationProblem(handledType(), strMo10869W, th3));
            }
        } catch (URISyntaxException e12) {
            return C42764f.m93699a(deserializationContext.handleInstantiationProblem(handledType(), strMo10869W, e12));
        }
    }

    static {
        boolean z11 = false;
        for (File file : File.listRoots()) {
            String path = file.getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z11 = true;
                break;
            }
        }
        f10363b = z11;
    }

    public NioPathDeserializer() {
        super((Class<?>) C42760b.m93694a());
    }
}
