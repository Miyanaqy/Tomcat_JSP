p a c k a g e   c o m . l i n . t a g ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . I t e r a t o r ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 i m p o r t   j a v a x . s e r v l e t . j s p . J s p E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . D y n a m i c A t t r i b u t e s ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . S i m p l e T a g S u p p o r t ;  
  
 p u b l i c   c l a s s   D y n a m i c A d d T a g   e x t e n d s   S i m p l e T a g S u p p o r t   i m p l e m e n t s   D y n a m i c A t t r i b u t e s   {  
 	 p r i v a t e   M a p < S t r i n g ,   F l o a t >   n u m   =   n e w   H a s h M a p < S t r i n g ,   F l o a t > ( ) ;  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   d o T a g ( )   t h r o w s   J s p E x c e p t i o n , I O E x c e p t i o n {  
 	 	 F l o a t   s u m   =   0 . 0 f ;  
 	 	 I t e r a t o r < M a p . E n t r y < S t r i n g ,   F l o a t > >   i t e r   =   t h i s . n u m . e n t r y S e t ( ) . i t e r a t o r ( ) ;  
 	 	 w h i l e ( i t e r . h a s N e x t ( ) ) {  
 	 	 	 M a p . E n t r y < S t r i n g ,   F l o a t >   v a l u e   =   i t e r . n e x t ( ) ;  
 	 	 	 s u m   + =   v a l u e . g e t V a l u e ( ) ;  
 	 	 }  
 	 	 s u p e r . g e t J s p C o n t e x t ( ) . g e t O u t ( ) . w r i t e ( s u m   +   " " ) ;  
 	 }  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   s e t D y n a m i c A t t r i b u t e ( S t r i n g   u r i ,   S t r i n g   l o c a l N a m e ,   O b j e c t   v a l u e )   t h r o w s   J s p E x c e p t i o n   {  
 	 	 n u m . p u t ( l o c a l N a m e ,   F l o a t . p a r s e F l o a t ( v a l u e . t o S t r i n g ( ) ) ) ;  
 	 	  
 	 }  
  
 }  
 	 