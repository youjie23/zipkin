/*
 * Copyright 2015-2018 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file is generated by jOOQ.
*/
package zipkin2.storage.mysql.v1.internal.generated;


import javax.annotation.Generated;

import org.jooq.Record;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinAnnotations;
import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinDependencies;
import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinSpans;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>zipkin</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> KEY_ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH = UniqueKeys0.KEY_ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH;
    public static final UniqueKey<Record> KEY_ZIPKIN_DEPENDENCIES_DAY = UniqueKeys0.KEY_ZIPKIN_DEPENDENCIES_DAY;
    public static final UniqueKey<Record> KEY_ZIPKIN_SPANS_TRACE_ID_HIGH = UniqueKeys0.KEY_ZIPKIN_SPANS_TRACE_ID_HIGH;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<Record> KEY_ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH = Internal.createUniqueKey(ZipkinAnnotations.ZIPKIN_ANNOTATIONS, "KEY_zipkin_annotations_trace_id_high", ZipkinAnnotations.ZIPKIN_ANNOTATIONS.TRACE_ID_HIGH, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.TRACE_ID, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.SPAN_ID, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.A_KEY, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.A_TIMESTAMP);
        public static final UniqueKey<Record> KEY_ZIPKIN_DEPENDENCIES_DAY = Internal.createUniqueKey(ZipkinDependencies.ZIPKIN_DEPENDENCIES, "KEY_zipkin_dependencies_day", ZipkinDependencies.ZIPKIN_DEPENDENCIES.DAY, ZipkinDependencies.ZIPKIN_DEPENDENCIES.PARENT, ZipkinDependencies.ZIPKIN_DEPENDENCIES.CHILD);
        public static final UniqueKey<Record> KEY_ZIPKIN_SPANS_TRACE_ID_HIGH = Internal.createUniqueKey(ZipkinSpans.ZIPKIN_SPANS, "KEY_zipkin_spans_trace_id_high", ZipkinSpans.ZIPKIN_SPANS.TRACE_ID_HIGH, ZipkinSpans.ZIPKIN_SPANS.TRACE_ID, ZipkinSpans.ZIPKIN_SPANS.ID);
    }
}