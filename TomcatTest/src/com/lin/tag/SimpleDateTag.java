p a c k a g e   c o m . l i n . t a g ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . t e x t . S i m p l e D a t e F o r m a t ;  
 i m p o r t   j a v a . u t i l . D a t e ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . J s p E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . S i m p l e T a g S u p p o r t ;  
 p u b l i c   c l a s s   S i m p l e D a t e T a g   e x t e n d s   S i m p l e T a g S u p p o r t {  
 	 p r i v a t e   S t r i n g   f o r m a t ;  
 	  
 	 p u b l i c   v o i d   d o T a g ( )   t h r o w s   J s p E x c e p t i o n {  
 	 	 S i m p l e D a t e F o r m a t   s d f   =   n e w   S i m p l e D a t e F o r m a t ( t h i s . f o r m a t ) ;  
 	 	 t r y   {  
 	 	 	 s u p e r . g e t J s p C o n t e x t ( ) . g e t O u t ( ) . w r i t e ( s d f . f o r m a t ( n e w   D a t e ( ) ) ) ;  
 	 	 	  
 	 	 } c a t c h ( I O E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 }  
 	 p u b l i c   S t r i n g   g e t F o r m a t ( )   {  
 	 	 r e t u r n   t h i s . f o r m a t ;  
 	 }  
 	 p u b l i c   v o i d   s e t F o r m a t ( S t r i n g   f o r m a t )   {  
 	 	 t h i s . f o r m a t   =   f o r m a t ;  
 	 }  
 }  
 