p a c k a g e   c o m . l i n . t e s t ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 / * *  
   *   S e r v l e t   i m p l e m e n t a t i o n   c l a s s   H e l l o S e r v l e t  
   * /  
 @ W e b S e r v l e t ( " / H e l l o S e r v l e t " )  
 p u b l i c   c l a s s   H e l l o S e r v l e t   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
                
         / * *  
           *   @ s e e   H t t p S e r v l e t # H t t p S e r v l e t ( )  
           * /  
         p u b l i c   H e l l o S e r v l e t ( )   {  
                 s u p e r ( ) ;  
                 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
         }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   O(u  G B K   ��n-N�eck8^>f:y 
 	 	 r e s p o n s e . s e t C h a r a c t e r E n c o d i n g ( " G B K " ) ;  
 	 	 r e s p o n s e . g e t W r i t e r ( ) . w r i t e ( " h e l l o   w o r l d ! ! ( s e r v l e t ) " ) ;  
 	 }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 d o G e t ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
 } 