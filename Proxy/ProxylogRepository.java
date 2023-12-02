class ProxyLogRepository extends ProdutoRepository {
    
    @Override
    public Object find(long id) {
        System.out.println("Buscando produto com id " + id);
        Object find = super.find(id);
        System.out.println("Buscando produto com id " + id);
        return find;
    }
    
}