p a c k a g e   c o m . l i n . t a g ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . J s p E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . J s p W r i t e r ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . T a g S u p p o r t ;  
 p u b l i c   c l a s s   H e l l o T a g   e x t e n d s   T a g S u p p o r t {  
 	 @ O v e r r i d e  
 	 p u b l i c   i n t   d o S t a r t T a g ( )   t h r o w s   J s p E x c e p t i o n {  
 	 	 J s p W r i t e r   o u t   =   s u p e r . p a g e C o n t e x t . g e t O u t ( ) ;  
 	 	 t r y   {  
 	 	 	 o u t . p r i n t l n ( " < h 1 > H e l l o   W o r l d ! ! ! < / h 1 > " ) ;  
 	 	 } c a t c h ( E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	 r e t u r n   T a g S u p p o r t . S K I P _ B O D Y ;  
 	 }  
 }  
 