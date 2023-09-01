/*
 * Copyright (c) 2023 Venator Labs, Inc. All Rights Reserved.
 * This code is licensed under the MIT License.
 *
 * For license terms, see LICENSE
 */

package org.venatorlabs.rodeo.plugin;

import java.util.List;
import java.util.Map;
import org.venatorlabs.rodeo.types.INode;
import org.venatorlabs.rodeo.types.IRelationship;

/**
 * Interface for hooking and manipulating documents, nodes, and relationships in the pipeline.
 */
public interface IHookable {
    public boolean isDocHook();

    public void processDoc(Map<String, Object> doc);

    public boolean isNodeHook();

    public void processNodes(List<INode> nodes);

    public boolean isRelationshipHook();

    public void processRelationships(List<IRelationship> rels);
}
