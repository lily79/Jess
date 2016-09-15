
/**
   Match descriptions as presented in the paper. Please note, that
   tradeoffs in efficiency are made for increased robustness and ease
   of formulation.
 */

/** 
    
*/

addStep('_match', { def args -> def p = args[0];
 delegate.astNodes().filter(p)
})

/**
 Walk the tree into the direction of the root
 stopping at the enclosing statement and output
 all parents that match the supplied predicate. Note, that this may
 include the enclosing statement node.
*/

addStep('matchParents', { def args -> def p = args[0];
    delegate.until(__.start().has(NODE_ISCFGNODE, 'True'))
            .emit() // no filtering here, because we filter at the end
            .repeat(__.start().parents())
            .unfold()
            .filter(p) // must filter here, because enclosing statement node is implicitly emitted.
})

/**
   
*/

arg = { def args -> def f = args[0]; def i = args[1];
  _().astNodes().filter{ it.type == 'CallExpression' && it.code.startsWith(f)}
  .out(AST_EDGE).filter{ it.childNum == '1' }.out(AST_EDGE).filter{ it.childNum == i}
}

/**
   
*/

param = { def args -> def x = args[0];
  p = { it.type == 'Parameter' && it.code.matches(x) } 
  delegate._match(p)
}
